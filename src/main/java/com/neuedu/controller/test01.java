package com.neuedu.controller;


import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.BrdBrand;
import com.neuedu.entity.ManManufacturer;
import com.neuedu.entity.SysUser;
import com.neuedu.entity.TbPictures;
import com.neuedu.service.BrdBrandService;
import com.neuedu.service.ManManufacturerService;
import com.neuedu.service.PicturesService;
import com.neuedu.service.impl.BrdBrandServiceImpl;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@RestController
public class test01 {
    @Autowired
    private ManManufacturerService manManufacturerService;

    @Autowired
    private BrdBrandService brdBrandService;

    @Autowired
    private PicturesService picturesService;

    @RequestMapping("/testManManufacturerService.do")
    public @ResponseBody
    String getmanufacturer(){
        ManManufacturer manufacturer = manManufacturerService.getManManufacturer(1);
        return JSONObject.toJSONString(manufacturer);
    }

    @RequestMapping("/testBrdBrandService.do")
    public @ResponseBody
    String getBrdBrandService(){
        ArrayList<BrdBrand> brdBrands = brdBrandService.getBrdBrands(1);
        return JSONObject.toJSONString(brdBrands);
    }

    @RequestMapping("/hash.do")
    public String hash(){
        String user = "huawei";
        String pwd = "123456";
        SimpleHash hash = new SimpleHash("SHA-1", user, pwd);
        String hashString = hash.toString();
        return hashString;
    }

    @RequestMapping("/imagePath_test.do")
    public String imagePath_test(){

        String picturesId = "6800af332d3542429c9f51e03927a628";
        TbPictures tbPictures = picturesService.selectImagePath(picturesId);
        String path = tbPictures.getPath();
        return path;

    }

    @RequestMapping("/test02.do")
    public String  inserttest(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        String name = "D:/study/java/javaweb/untitled/MyBuys_20220504/src/main/webapp/static/image/"+multipartFile.getOriginalFilename();
        System.out.printf("", name);
        File file = new File(name);
        multipartFile.transferTo(file);
        return multipartFile.getOriginalFilename();
    }

    @RequestMapping("/test03.do")
    public String  inserttest1(HttpServletRequest request) throws IOException {

        return request.getServletContext().getRealPath("/static/picture");
    }
    @RequestMapping("delete.do")
    public String delete(){
        File file = new File("D:/study/java/javaweb/untitled/MyBuys_20220504/src/main/webapp/static/image/OW)W73MA{V%$ZZ8[)WCY6~V1.jpg");
        if (file.exists()){
            file.delete();
            return "file success";
        }
        return "file no save";
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("1",111);
//        stringIntegerHashMap.put("2",222);
//        stringIntegerHashMap.put("3",333);
//        stringIntegerHashMap.put("4",444);
//        Set<String> keySet = stringIntegerHashMap.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.printf("\n"+stringIntegerHashMap.get(next));
//
//        }

    }



}
