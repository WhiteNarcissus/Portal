package com.mjc.portal.dao;

import com.mjc.portal.domain.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(Long noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long noticeId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);
}