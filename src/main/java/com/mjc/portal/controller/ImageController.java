package com.mjc.portal.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mjc.portal.domain.Image;
import com.mjc.portal.service.ImageService;

@Controller
public class ImageController {

    @Autowired  
	private ImageService imageService;
	
	
	@RequestMapping("/imageEdit")
	public ModelAndView imageEdit() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/image/imageEdit");
	  return  mv; 
	}
  
	@RequestMapping("/imageUpload")
	 public ModelAndView  imageUpload(HttpServletRequest request ,MultipartFile photoPaths) throws Exception{  
        
		
        //使用UUID给图片重命名，并去掉四个“-”  
        String name = UUID.randomUUID().toString().replaceAll("-", "");  
        //获取文件的扩展名  
        String ext = FilenameUtils.getExtension(photoPaths.getOriginalFilename());  
        //设置图片上传路径  
        String url = request.getSession().getServletContext().getRealPath("/upload");  
         
        
        ModelAndView mv = new ModelAndView();
        //以绝对路径保存重名命后的图片  
        photoPaths.transferTo(new File(url+"/"+name + "." + ext));  
        //把图片存储路径保存到数据库  
        String s= "upload/"+name + "." + ext;
        System.out.println(s);
        Image image = new Image();
        image.setImageUrl(s);
        image.setImageType(0);
        this.imageService.addOneImage(image);   
        
        List<Image> list = this.imageService.selectAll();	
        
        mv.addObject("imageList",list );
        mv.setViewName("image/image");
     
        return mv;  
          
    }  
	
}
