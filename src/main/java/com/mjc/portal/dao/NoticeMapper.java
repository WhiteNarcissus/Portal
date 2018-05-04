package com.mjc.portal.dao;

import java.util.List;

import com.mjc.portal.domain.Notice;

public interface NoticeMapper {
  void insertNotice(Notice nt);
  List<Notice> noticeList();
}