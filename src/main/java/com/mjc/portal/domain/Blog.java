package com.mjc.portal.domain;

import java.util.Date;

public class Blog {
    private Long blogId;

    private Integer blogSeq;

    private Integer blogState;

    private Date blogPublishTime;

    private Date blogUnpublishTime;

    private Date createTime;

    private String blogContext;

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Integer getBlogSeq() {
        return blogSeq;
    }

    public void setBlogSeq(Integer blogSeq) {
        this.blogSeq = blogSeq;
    }

    public Integer getBlogState() {
        return blogState;
    }

    public void setBlogState(Integer blogState) {
        this.blogState = blogState;
    }

    public Date getBlogPublishTime() {
        return blogPublishTime;
    }

    public void setBlogPublishTime(Date blogPublishTime) {
        this.blogPublishTime = blogPublishTime;
    }

    public Date getBlogUnpublishTime() {
        return blogUnpublishTime;
    }

    public void setBlogUnpublishTime(Date blogUnpublishTime) {
        this.blogUnpublishTime = blogUnpublishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext == null ? null : blogContext.trim();
    }
}