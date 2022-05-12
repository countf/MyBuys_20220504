package com.neuedu.controller;

import com.neuedu.entity.TbPictures;
import com.neuedu.service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class imageContrller {
    @Autowired
    private PicturesService picturesService;


    @RequestMapping(value = "/imagePath.do",method = RequestMethod.POST)
    public ModelAndView imagePath_test(String imagePath,ModelAndView modelAndView){

        String picturesId = imagePath;
        TbPictures tbPictures = picturesService.selectImagePath(picturesId);
        if (tbPictures!=null){
            modelAndView.addObject("imageData",tbPictures);
            modelAndView.setViewName("inserData");
            return modelAndView;
        }else {
            tbPictures = null;
            modelAndView.addObject("imageData",tbPictures);
            modelAndView.setViewName("inserData");
            return modelAndView;
        }
    }


    @RequestMapping("/insertImage")
    public ModelAndView insertImage(String PicturesId,String title,String name,String path,String createtime,String masterId,String bz,ModelAndView modelAndView){
        TbPictures tbPictures = new TbPictures();
        tbPictures.setPicturesId(PicturesId);
        tbPictures.setTitle(title);
        tbPictures.setName(name);
        tbPictures.setPath(path);
        tbPictures.setCreatetime(createtime);
        tbPictures.setMasterId(masterId);
        tbPictures.setBz(bz);
        picturesService.insertImager(tbPictures);
        modelAndView.setViewName("inserData");
        return modelAndView;
    }



    @RequestMapping("/deleteImage.do")
    public ModelAndView deleteImage(String deleteImageId,ModelAndView modelAndView){
        picturesService.deleteImage(deleteImageId);
        modelAndView.setViewName("inserData");
        return modelAndView;
    }

    @RequestMapping("/updateImage.do")
    public ModelAndView updateImage(String PicturesId,String title,String name,String path,String createtime,String masterId,String bz,ModelAndView modelAndView){
        TbPictures tbPictures = new TbPictures();
        tbPictures.setPicturesId(PicturesId);
        tbPictures.setTitle(title);
        tbPictures.setName(name);
        tbPictures.setPath(path);
        tbPictures.setCreatetime(createtime);
        tbPictures.setMasterId(masterId);
        tbPictures.setBz(bz);
        picturesService.updateImage(tbPictures);
        modelAndView.setViewName("inserData");
        return modelAndView;
    }
}
