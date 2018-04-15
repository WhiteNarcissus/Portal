package com.mjc.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjc.portal.dao.ImageMapper;
import com.mjc.portal.domain.Image;
import com.mjc.portal.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService  {
	  @Autowired
	  private ImageMapper imageMapper;
	
	
	public void addOneImage(Image image) {
		// TODO Auto-generated method stub
		imageMapper.addOneImage(image);
	}


	public List<Image> selectAll() {
		// TODO Auto-generated method stub
		return imageMapper.selectAll();
	}

}
