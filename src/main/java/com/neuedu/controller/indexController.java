package com.neuedu.controller;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.dao.SysUserMapper;
import com.neuedu.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class indexController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping ("/index01.do")
    public String index(){
        System.out.printf("111111111111222222222222");
        return "<h1>this is index<h1>";
    }

    @RequestMapping("/user/get.do")
    public @ResponseBody String getSysUser(){
        SysUser user= sysUserMapper.selectByPrimaryKey(1);
        return JSONObject.toJSONString(user);
    }

    @RequestMapping("/hello01.do")
    @ResponseBody
    public String hello(){
        return "/hello11.jsp";
    }






}
