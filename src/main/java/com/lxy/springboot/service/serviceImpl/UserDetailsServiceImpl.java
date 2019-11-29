package com.lxy.springboot.service.serviceImpl;

import com.lxy.springboot.dao.StaffDao;
import com.lxy.springboot.dao.UserDao;
import com.lxy.springboot.domain.Staff;
import com.lxy.springboot.utils.JwtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private StaffDao staffDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Map<String, Object> map = new HashMap<>();
        map.put("staff_account", s);
        Staff staff = staffDao.selectByMap(map).get(0);
        return new JwtUser(staff);
    }
}
