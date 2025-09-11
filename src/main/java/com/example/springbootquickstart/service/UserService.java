package com.example.springbootquickstart.service;

import com.example.springbootquickstart.pojo.User;

public interface UserService {
    //注册
    void register(String username, String password);

    //根据用户名查询用户
    User findByUserName(String username);
}
