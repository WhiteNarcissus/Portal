package com.mjc.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mjc.portal.domain.Blog;

@Controller
public class BlogController {
	
	@RequestMapping("/blog")
	public String blog() {
 
	  return "blog/blog"; 
	}
	@RequestMapping("/blogEdit")
	public String blogEdit() {
		
     return "blog/blogEdit";
	}
	
	@RequestMapping("/blogSave")
	@ResponseBody
	public String blogSave(Blog blog) {
   //这里的表单提交，如果在 input 标签中的 name 和blog 相同就不需要用@parameter 注解
  System.out.println(blog.getBlogContext()+":"+blog.getBlogTitle());
		
     return "";
	}
	
	
	
}
