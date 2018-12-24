package com.mjc.portal.service.impl;

import com.mjc.portal.service.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjc.portal.dao.UserMapper;
import com.mjc.portal.domain.User;
import com.mjc.portal.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	  @Autowired
	    private UserMapper userMapper;
	  @Autowired
	  private RedisUtils redisUtils;
   	public User checkLogin(String username, String password) {

   		redisUtils.get("password");
   		redisUtils.set("zzz","zzz");
		 User user = userMapper.selectByName(username);
	        if(user != null && user.getPassword().equals(password)){

	            return user;
	        }
	        return null;
	    }
	}


