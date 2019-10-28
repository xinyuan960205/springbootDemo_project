package com.lxy.springboot.dao;


import com.lxy.springboot.domain.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
}
