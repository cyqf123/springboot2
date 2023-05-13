package com.example.service.impl;


import com.example.mappers.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String passWord) {
        return this.userMapper.login(userName,passWord);
    }

    @Override
    public List<User> lookAllUser() {
        return this.userMapper.lookAllUser();
    }

    @Override
    public int selectNum() {
        return this.userMapper.selectNum();
    }
}
