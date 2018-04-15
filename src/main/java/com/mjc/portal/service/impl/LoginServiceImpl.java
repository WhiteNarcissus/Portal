package com.mjc.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjc.portal.dao.UserMapper;
import com.mjc.portal.domain.User;
import com.mjc.portal.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	  @Autowired
	    private UserMapper userMapper;

	public User checkLogin(String username, String password) {
		 User user = userMapper.selectByName(username);
		   
	        if(user != null && user.getPassword().equals(password)){

	            return user;
	        }
	        return null;
	    }
	}


