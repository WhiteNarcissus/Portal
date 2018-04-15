package com.mjc.portal.dao;

import com.mjc.portal.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByName(String username);
}