package com.mjc.portal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mjc.portal.dao.UserMapper;
import com.mjc.portal.domain.User;
import com.mjc.portal.service.LoginService;

@Controller
//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("Cuser")
public class LoginController {
	
    @Autowired  
	private LoginService loginService;
   
	 
	@RequestMapping("/login")
	public String login(User user,Model model) {
		
		 //调用service方法
        user = loginService.checkLogin(user.getUsername(), user.getPassword());        
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
        	 model.addAttribute("user",user);
          if(user.getUsername().equals("admin")&&user.getPassword().equals("admin")) {
        	 return "admin";
            }else {
        	   
        	 return "success";  
           }
        }
        return "unsuccess";
	}

	 //注销方法
    @RequestMapping("/outLogin")
    public ModelAndView outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        ModelAndView mv = new ModelAndView();
        
        mv.addObject("outLogin");
        
        return mv;
    }
	
	
}
