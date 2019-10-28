package com.lxy.springboot.service.serviceImpl;

import com.lxy.springboot.dao.UserDao;
import com.lxy.springboot.domain.User;
import com.lxy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //获取用户
    public List<User> getAllUser(){
        return this.userDao.getAllUser();
    }
}
