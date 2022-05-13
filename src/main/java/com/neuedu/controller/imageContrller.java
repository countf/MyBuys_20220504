package com.neuedu.controller;

import com.neuedu.entity.TbPictures;
import com.neuedu.service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
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
            String imageName = "/static/picture/" + tbPictures.getName();
            modelAndView.addObject("imageData",tbPictures);
            modelAndView.addObject("imageName",imageName);
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
    public ModelAndView deleteImage(String deleteImageId,ModelAndView modelAndView,HttpServletRequest request){
        TbPictures tbPictures = picturesService.selectImagePath(deleteImageId);
        String getName = tbPictures.getName();
        String realName = request.getServletContext().getRealPath("/src/main/webapp/static/picture/");
        String name = realName+getName;
        name = name.replace("target\\MyBuys_20220504\\","");
        File file = new File(name);
        if (file.exists()){
            file.delete();
        }
        picturesService.deleteImage(deleteImageId);
        modelAndView.setViewName("inserData");
        return modelAndView;
    }

    @RequestMapping("deleteImageload.do")
    public String delete(HttpServletRequest request,String imageId){
        File file = new File("D:/study/java/javaweb/untitled/MyBuys_20220504/src/main/webapp/static/picture/OW)W73MA{V%$ZZ8[)WCY6~V1.jpg");
        if (file.exists()){
            file.delete();
            return "file success";
        }
        return imageId;
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


    @RequestMapping("/uploadImage.do")
    public ModelAndView  inserttest(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request,ModelAndView modelAndView, String imageId) throws IOException {

        String originalFilename = multipartFile.getOriginalFilename();
        String realPath = request.getServletContext().getRealPath("/static/picture/");


        String name = realPath+originalFilename;
        TbPictures tbPictures = picturesService.selectImagePath(imageId);
        if (tbPictures==null){
            modelAndView.setViewName("inserData");
            return modelAndView;
        }

        if (!multipartFile.isEmpty()){
            File file = new File(name);
            multipartFile.transferTo(file);
        }else {
            modelAndView.setViewName("inserData");
            return modelAndView;
        }
        if (tbPictures!=null){
            String path=name;
            tbPictures.setPath(path);
            tbPictures.setName(originalFilename);
            picturesService.updateImage(tbPictures);
            String imageName = "static/picture/" + tbPictures.getName();
            modelAndView.addObject("imageName",imageName);
            modelAndView.setViewName("inserData");
            return modelAndView;
        }else {
            modelAndView.setViewName("inserData");
            return modelAndView;
        }
    }




}
