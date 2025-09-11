package com.example.springbootquickstart.service.impl;

import com.example.springbootquickstart.mapper.UserMapper;
import com.example.springbootquickstart.pojo.User;
import com.example.springbootquickstart.service.UserService;
import com.example.springbootquickstart.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(String username, String password) {
        //加密
        String md5String = Md5Util.getMD5String(password);
        //添加
        userMapper.add(username,password);
    }

    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }
}
