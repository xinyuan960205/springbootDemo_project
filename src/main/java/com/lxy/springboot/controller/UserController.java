package com.lxy.springboot.controller;

import com.lxy.springboot.domain.Msg;
import com.lxy.springboot.domain.User;
import com.lxy.springboot.service.UserService;
import com.lxy.springboot.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    @ApiOperation("获取所有用户")
    public Msg getAllUser(){
        return ResultUtil.success(userService.getAllUser());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation("根据ID查询用户")
    public Msg queryUserById(@PathVariable("id") Integer userId){
        return ResultUtil.success(userService.queryUserById(userId));
    }

    @PostMapping(value = "")
    @ApiOperation("添加用户")
    public Msg addUser(User user){
        return ResultUtil.success(userService.addUser(user));
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation("删除用户")
    public Msg deleteUserById(@PathVariable("id") Integer userId){
        return ResultUtil.success(userService.deleteUserById(userId));
    }

    @PutMapping(value = "")
    @ApiOperation("修改用户")
    public Msg updateUser(User user){
        return ResultUtil.success(userService.updateUser(user));
    }
}
