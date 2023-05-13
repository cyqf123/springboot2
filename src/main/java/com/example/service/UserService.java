package com.example.service;

import com.example.pojo.User;

import java.util.List;


public interface UserService {
    User login( String userName,  String passWord);

    List<User> lookAllUser();//查询所有

    int selectNum();//查询数量
}
