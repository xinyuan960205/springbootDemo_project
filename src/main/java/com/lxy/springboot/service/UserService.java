package com.lxy.springboot.service;

import com.lxy.springboot.domain.User;

import java.util.List;

public interface UserService {
    //获取用户
    List<User> getAllUser();
    //根据用户编号查询用户信息
    User queryUserById(Integer userId);
    //添加用户
    Integer addUser(User user);
    //根据用户ID删除用户
    Integer deleteUserById(Integer userId);
    //修改用户
    Integer updateUser(User user);
}
