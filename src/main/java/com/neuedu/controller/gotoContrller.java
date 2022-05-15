package com.neuedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class gotoContrller {
    @RequestMapping("goInserData.do")
    public ModelAndView goInserData(ModelAndView modelAndView){
        modelAndView.setViewName("inserData");
        return modelAndView;
    }

    @RequestMapping("goCustomers.do")
    public ModelAndView goCustomers(ModelAndView modelAndView){
        modelAndView.setViewName("customers");
        return modelAndView;
    }

    //������ҳ����
    @RequestMapping("/backIndex.do")
    public void backIndex(HttpServletResponse response) throws IOException {
        response.sendRedirect("/index.html");
    }

    //����ע��
    @RequestMapping("goRegister.do")
    public ModelAndView gotoRegister(ModelAndView modelAndView){
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
