package com.neuedu.controller;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.ManManufacturer;
import com.neuedu.entity.SysUser;
import com.neuedu.service.ManManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/customers")
public class ManufacturerController {


    @Autowired
    private ManManufacturerService manManufacturerService;


    @RequestMapping(value = "/get.do",method = RequestMethod.GET)
    public ModelAndView getManu(HttpSession session, ModelAndView model, HttpServletResponse response) throws IOException {

        SysUser user = (SysUser) session.getAttribute("user");
        ManManufacturer manManufacturer =null;

        if (user!=null){
            manManufacturer = manManufacturerService.getManManufacturer(user.getManBuyerId());
            if (manManufacturer!=null){
                model.addObject("customers",manManufacturer);//������ת��jsp�����������֣�����EL���ʽ��ȡ����
                model.setViewName("customers"); //������ת��WEB-INF/jsp/xxx.jsp
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


}
