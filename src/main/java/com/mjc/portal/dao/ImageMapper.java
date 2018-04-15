package com.mjc.portal.dao;

import java.util.List;

import com.mjc.portal.domain.Image;

public interface ImageMapper {
    int deleteByPrimaryKey(Long imageId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Long imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
    
    //增加一条数据
    void addOneImage(Image image);
    
    List<Image> selectAll();
}