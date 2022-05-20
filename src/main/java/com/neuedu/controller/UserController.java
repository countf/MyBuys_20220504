package com.neuedu.controller;

import com.neuedu.entity.SysUser;
import com.neuedu.entity.UllUserLoginLogoutLog;
import com.neuedu.service.SysUserService;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    //声明业务逻辑层对应的接口，并添加自动注入注解
    @Autowired
    private SysUserService sysUserService;



    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public void login(@RequestParam(required = true) String uname,
                      @RequestParam(required = true) String pwd,
                      HttpSession session, HttpServletResponse response,HttpServletRequest request) throws IOException {
        //对密码进行加密处理
        String passwd = new SimpleHash("SHA-1", uname, pwd).toString();	//密码加密
        SysUser sysUser=sysUserService.login(uname,passwd);
        if(sysUser!=null){//判断用户是否为空，空 则用户名或密码不正确   非空 登录成功
            session.setAttribute("user",sysUser);

            //更新用户登录信息
            sysUser.setIp(getClientIP(request));
            sysUserService.upLoginInfo(sysUser);

            //插入登录日志
            UllUserLoginLogoutLog loginLogoutLog=new UllUserLoginLogoutLog();
            loginLogoutLog.setUsiId(String.valueOf(sysUser.getUserId()));
            loginLogoutLog.setToken("1");
            loginLogoutLog.setTerminalType("2");
            loginLogoutLog.setOperatingType("1");
            loginLogoutLog.setOperatingDate(new Date(System.currentTimeMillis()));
            loginLogoutLog.setCreatedBy(sysUser.getName());
            loginLogoutLog.setLastUpdateBy(sysUser.getName());
            sysUserService.logOutLog(loginLogoutLog);


            if(sysUser.getRoleId().equals("1"))
                response.sendRedirect("../index.html"); //管理员界面
            else
                response.sendRedirect("../index.html"); //用户界面
        }
        else
            response.sendRedirect("../login.html");

    }




    @RequestMapping(value = "/logout.do",method = {RequestMethod.GET})
    public void toLogOut(HttpSession session,HttpServletResponse response) throws IOException {
        //插入登出日志
        SysUser sysUser=(SysUser)session.getAttribute("user");
        UllUserLoginLogoutLog loginLogoutLog=new UllUserLoginLogoutLog();
        loginLogoutLog.setUsiId(String.valueOf(sysUser.getUserId()));
        loginLogoutLog.setToken("1");
        loginLogoutLog.setTerminalType("2");
        loginLogoutLog.setOperatingType("2");
        loginLogoutLog.setOperatingDate(new Date(System.currentTimeMillis()));
        loginLogoutLog.setCreatedBy(sysUser.getName());
        loginLogoutLog.setLastUpdateBy(sysUser.getName());
        sysUserService.logOutLog(loginLogoutLog);

        //让sessopn失效
        session.invalidate();
        response.sendRedirect("../login.html");
    }




    public static String getClientIP(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;

    }
}