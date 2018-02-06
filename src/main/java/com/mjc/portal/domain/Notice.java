package com.mjc.portal.domain;

import java.util.Date;

public class Notice {
    private Long noticeId;

    private Integer noticeSeq;

    private Date noticePublishTime;

    private Integer noticeState;

    private String noticeTitle;

    private String noticeContext;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getNoticeSeq() {
        return noticeSeq;
    }

    public void setNoticeSeq(Integer noticeSeq) {
        this.noticeSeq = noticeSeq;
    }

    public Date getNoticePublishTime() {
        return noticePublishTime;
    }

    public void setNoticePublishTime(Date noticePublishTime) {
        this.noticePublishTime = noticePublishTime;
    }

    public Integer getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
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