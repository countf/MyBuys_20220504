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

    //����ҵ���߼����Ӧ�Ľӿڣ�������Զ�ע��ע��
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public void login(@RequestParam(required = true) String uname,
                      @RequestParam(required = true) String pwd,
                      HttpSession session, HttpServletResponse response) throws IOException {
        //��������м��ܴ���
        String passwd = new SimpleHash("SHA-1", uname, pwd).toString();	//�������
        SysUser sysUser=sysUserService.login(uname,passwd);
        if(sysUser!=null){//�ж��û��Ƿ�Ϊ�գ��� ���û��������벻��ȷ   �ǿ� ��¼�ɹ�
            session.setAttribute("user",sysUser);
            response.sendRedirect("/index.html");
        }
        else
            response.sendRedirect("/login.html");

    }
}