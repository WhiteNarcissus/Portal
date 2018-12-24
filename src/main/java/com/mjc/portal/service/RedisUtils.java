package com.mjc.portal.service;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/23 0023.
 */
@Service
public class RedisUtils {
    private RedisTemplate<String, Object> redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }




    public  void set(String k, String v){
        redisTemplate.opsForValue().set(k,v);
    }

    public  String get(String k){
       return  redisTemplate.opsForValue().get(k).toString();
    }
}
