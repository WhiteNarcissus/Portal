package com.mjc.portal.domain;

import java.util.Date;

public class Notice {
    private Long noticeId;

    private Date createTime;
    
    private String noticeTitle;

    private String noticeContext;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

   

    public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeContext() {
        return noticeContext;
    }

    public void setNoticeContext(String noticeContext) {
        this.noticeContext = noticeContext == null ? null : noticeContext.trim();
    }
}