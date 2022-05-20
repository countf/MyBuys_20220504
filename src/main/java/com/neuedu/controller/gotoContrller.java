package com.neuedu.controller;

import com.neuedu.entity.ManManufacturer;
import com.neuedu.entity.SysUser;
import com.neuedu.service.ManManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class gotoContrller {

    @Autowired
    private ManManufacturerService manManufacturerService;



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

    //返回主页方法
    @RequestMapping("/backIndex.do")
    public void backIndex(HttpServletResponse response) throws IOException {
        response.sendRedirect("/index.html");
    }

    //返回注册
    @RequestMapping("goRegister.do")
    public ModelAndView gotoRegister(ModelAndView modelAndView){
        modelAndView.setViewName("register");
        return modelAndView;
    }


    @RequestMapping("/goProcts.do")
    public ModelAndView toHtml(ModelAndView modelAndView, HttpSession session){
        SysUser user = (SysUser)session.getAttribute("user");
        if (user!=null){
            ManManufacturer manManufacturer = manManufacturerService.getManManufacturer(user.getUserId());
            modelAndView.addObject("product",manManufacturer);
            modelAndView.setViewName("products");
        }else {
            modelAndView.setViewName("products");
        }

        return modelAndView;
    }


    @RequestMapping("goNewbrd.do")
    public ModelAndView goNewbrd(ModelAndView modelAndView){
        modelAndView.setViewName("newBrand");
        return modelAndView;
    }

    @RequestMapping("goAllbrd.do")
    public ModelAndView goAllbrd(ModelAndView modelAndView){
        modelAndView.setViewName("allBrand");
        return modelAndView;
    }

}
