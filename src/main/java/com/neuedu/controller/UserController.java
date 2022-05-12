package com.neuedu.controller;

import com.neuedu.entity.SysUser;
import com.neuedu.service.SysUserService;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {

    //声明业务逻辑层对应的接口，并添加自动注入注解
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public void login(@RequestParam(required = true) String uname,
                      @RequestParam(required = true) String pwd,
                      HttpSession session, HttpServletResponse response) throws IOException {
        //对密码进行加密处理
        String passwd = new SimpleHash("SHA-1", uname, pwd).toString();	//密码加密
        SysUser sysUser=sysUserService.login(uname,passwd);
        if(sysUser!=null){//判断用户是否为空，空 则用户名或密码不正确   非空 登录成功
            session.setAttribute("user",sysUser);
            response.sendRedirect("/index.html");
        }
        else
            response.sendRedirect("/login.html");

    }
}