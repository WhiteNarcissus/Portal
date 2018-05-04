package com.mjc.portal.service;

import java.util.List;

import com.mjc.portal.domain.Notice;

public interface NoticeService {
	void insertNotice(Notice nt);
	
	List<Notice> noticeList();
}
