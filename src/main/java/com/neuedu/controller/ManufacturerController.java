package com.neuedu.controller;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.ManManufacturer;
import com.neuedu.entity.SysUser;
import com.neuedu.service.ManManufacturerService;
import com.neuedu.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/customers")
public class ManufacturerController {


    @Autowired
    private ManManufacturerService manManufacturerService;

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/get.do",method = RequestMethod.GET)
    public ModelAndView getManu(HttpSession session, ModelAndView model, HttpServletResponse response) throws IOException {

        SysUser user = (SysUser) session.getAttribute("user");
        ManManufacturer manManufacturer =null;

        if (user!=null){
            manManufacturer = manManufacturerService.getManManufacturer(user.getManBuyerId());
            if (manManufacturer!=null){
                model.addObject("customers",manManufacturer);//设置跳转到jsp里面对象的名字，可用EL表达式获取属性
                model.setViewName("customers"); //设置跳转到WEB-INF/jsp/xxx.jsp
                return model;
            }else {
                response.sendRedirect("/manu/createNew.do");
                return null;
            }
        }else {
            response.sendRedirect("../login.html");
            return null;
        }
    }



    @RequestMapping("/inserProduct.do")
    public String inserProduct(ManManufacturer manManufacturer, Model model,HttpSession session){
        SysUser user = (SysUser) session.getAttribute("user");
        Integer userId = user.getUserId();
        manManufacturer.setManId(userId);
        manManufacturerService.inserManManufacturer(manManufacturer);
        user.setManBuyerId(manManufacturer.getManId());
        sysUserService.allUpta(user);
        model.addAttribute("product",manManufacturer);
        return "products";
    }


}
