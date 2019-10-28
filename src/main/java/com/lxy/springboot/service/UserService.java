package com.lxy.springboot.service;

import com.lxy.springboot.domain.User;

import java.util.List;

public interface UserService {
    //获取用户
    List<User> getAllUser();
}
