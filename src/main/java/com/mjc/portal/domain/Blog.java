package com.mjc.portal.domain;

import java.util.Date;

public class Blog {
    private Long blogId;
    private String blogTitle;
    private String blogContext;
    private Date createTime;
    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

 

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContext() {
		return blogContext;
	}

	public void setBlogContext(String blogContext) {
		this.blogContext = blogContext;
	}

}