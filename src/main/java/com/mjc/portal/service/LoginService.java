package com.mjc.portal.service;

import com.mjc.portal.domain.User;

public interface LoginService {
	/* 
     * 检验用户登录业务
     */  
    User checkLogin(String username,String password);


}
