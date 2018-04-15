package com.mjc.portal.service;

import java.util.List;

import com.mjc.portal.domain.Image;

public interface ImageService {
	
	//将新增的图片存入数据库
	void addOneImage(Image image);
	
    List<Image> selectAll();
}
