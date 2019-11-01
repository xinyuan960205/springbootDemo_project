package com.lxy.springboot.service.serviceImpl;

import com.lxy.springboot.dao.UserDao;
import com.lxy.springboot.domain.User;
import com.lxy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //获取用户
    public List<User> getAllUser(){
        return this.userDao.selectList(null);
    }

    //根据用户编号查询用户信息
    public User queryUserById(Integer userId){

        return this.userDao.selectById(userId);
    }

    //添加用户
    public Integer addUser(User user){
        return this.userDao.insert(user);
    }

    //根据用户ID删除用户
    public Integer deleteUserById(Integer userId){
        Map<String, Object> map=new HashMap<>();
        map.put("user_id", userId);
        return this.userDao.deleteByMap(map);
    }

    //修改用户
    public Integer updateUser(User user){
        return this.userDao.updateById(user);
    }
}
