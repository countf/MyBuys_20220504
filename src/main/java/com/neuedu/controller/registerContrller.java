package com.neuedu.controller;

import com.neuedu.entity.SysUser;
import com.neuedu.service.RegisterService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class registerContrller {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("register.do")
    public void register(HttpServletResponse response, String uname, String pwd, String email) throws IOException {
        SysUser sysUser = new SysUser();
        String hashPwd = new SimpleHash("SHA-1", uname, pwd).toString();
        sysUser.setUsername(uname);
        sysUser.setPassword(hashPwd);
        sysUser.setEmail(email);
        sysUser.setName(uname);
        sysUser.setManBuyerId(Integer.valueOf(1));
        sysUser.setPhone("13888888888");
        registerService.register(sysUser);
        response.sendRedirect("/login.html");
    }
}
