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

    //����ҵ���߼����Ӧ�Ľӿڣ�������Զ�ע��ע��
    @Autowired
    private SysUserService sysUserService;



    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public void login(@RequestParam(required = true) String uname,
                      @RequestParam(required = true) String pwd,
                      HttpSession session, HttpServletResponse response,HttpServletRequest request) throws IOException {
        //��������м��ܴ���
        String passwd = new SimpleHash("SHA-1", uname, pwd).toString();	//�������
        SysUser sysUser=sysUserService.login(uname,passwd);
        if(sysUser!=null){//�ж��û��Ƿ�Ϊ�գ��� ���û��������벻��ȷ   �ǿ� ��¼�ɹ�
            session.setAttribute("user",sysUser);

            //�����û���¼��Ϣ
            sysUser.setIp(getClientIP(request));
            sysUserService.upLoginInfo(sysUser);

            //�����¼��־
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
                response.sendRedirect("../index.html"); //����Ա����
            else
                response.sendRedirect("../index.html"); //�û�����
        }
        else
            response.sendRedirect("../login.html");

    }




    @RequestMapping(value = "/logout.do",method = {RequestMethod.GET})
    public void toLogOut(HttpSession session,HttpServletResponse response) throws IOException {
        //����ǳ���־
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

        //��sessopnʧЧ
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