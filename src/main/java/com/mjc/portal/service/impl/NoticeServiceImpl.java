package com.mjc.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjc.portal.dao.NoticeMapper;
import com.mjc.portal.domain.Notice;
import com.mjc.portal.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{
	  @Autowired
	  private NoticeMapper  noticeMapper;
	
	
	
	
	public void insertNotice(Notice nt) {
		// TODO Auto-generated method stub
		noticeMapper.insertNotice(nt);
	}




	public List<Notice> noticeList() {
		// TODO Auto-generated method stub
		return noticeMapper.noticeList();
	}

}
