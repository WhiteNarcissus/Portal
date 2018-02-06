package com.mjc.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mjc.portal.dao.UserMapper;
import com.mjc.portal.service.LoginService;

@Controller
public class LoginController {
	
    @Autowired  
	private LoginService loginService;
    @Autowired  
    private UserMapper userMapper;
	 
	@RequestMapping("/login")
	public ModelAndView login() {
		
		System.out.println(loginService.login());
		
		
		System.out.println(userMapper.selectByPrimaryKey(1L).getUsername());
		ModelAndView mv = new ModelAndView("success");
		return mv;
	}

}
