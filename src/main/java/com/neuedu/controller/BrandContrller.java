package com.neuedu.controller;

import com.neuedu.entity.BrdBrand;
import com.neuedu.entity.ManManufacturer;
import com.neuedu.entity.SysUser;
import com.neuedu.service.BrdBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class BrandContrller {

    @Autowired
    private BrdBrandService brdBrandService;


    @RequestMapping("/allBrd.do")
    public ModelAndView allBrd(HttpSession session,ModelAndView modelAndView){
        SysUser user = (SysUser) session.getAttribute("user");
        ArrayList<BrdBrand> brdBrands=null;
        if(user!=null){
             brdBrands = brdBrandService.getBrdBrands(user.getUserId());
        }
        modelAndView.addObject("brdBrands",brdBrands);
        modelAndView.setViewName("allBrand");
        return modelAndView;
    }

    @RequestMapping("/Newbrand.do")
    public ModelAndView newbrd(BrdBrand brdBrand,HttpSession session)  {
        SysUser user = (SysUser) session.getAttribute("user");
        Integer userId = user.getUserId();
        brdBrand.setManId(userId);
        brdBrandService.newBrdBrand(brdBrand);
        return new ModelAndView("redirect:/allBrd.do");
    }

    @RequestMapping("/delbra.do")
    public ModelAndView delbra(@RequestParam("brd") int braId, ModelAndView modelAndView){
        brdBrandService.delbrd(braId);
        modelAndView.setViewName("redirect:/allBrd.do");
        return modelAndView;
    }


    @RequestMapping("/select.do")
    public ModelAndView selectOnly(@RequestParam("brd") int braId,ModelAndView modelAndView){
        BrdBrand brdBrand = brdBrandService.selectMid(braId);
        modelAndView.addObject("brd",brdBrand);
        modelAndView.setViewName("updaBrand");
        return modelAndView;
    }

    @RequestMapping("/updaBrd.do")
    public ModelAndView updaBrd(BrdBrand brdBrand,ModelAndView modelAndView){
        brdBrandService.updaBrd(brdBrand);
        modelAndView.setViewName("redirect:/allBrd.do");
        return modelAndView;
    }
}
