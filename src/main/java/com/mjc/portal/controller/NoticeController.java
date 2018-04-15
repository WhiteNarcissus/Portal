package com.mjc.portal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mjc.portal.domain.Notice;
import com.mjc.portal.service.NoticeService;

@Controller
public class NoticeController {
	  @Autowired  
		private NoticeService noticeService;
	   
	
	
	@RequestMapping("/notice")
	public String blog() {
 
	  return "notice/notice"; 
	}
	@RequestMapping("/noticeEdit")
	public  ModelAndView noticeEdit() {
		 ModelAndView mv = new ModelAndView();
	        mv.setViewName("/notice/noticeEdit");
     return mv;
	}
	
	@RequestMapping("/noticeSave")
	@ResponseBody
	public String blogSave(Notice notice) {
   //这里的表单提交，如果在 input 标签中的 name 和notice 相同就不需要用@parameter 注解
      Notice nt = new Notice();
      nt.setCreateTime(new Date());
      nt.setNoticeContext(notice.getNoticeContext());
      nt.setNoticeTitle(notice.getNoticeTitle());
      noticeService.insertNotice(nt);	
      
     
     return "notice/noticeEdit";
	}
	
}
