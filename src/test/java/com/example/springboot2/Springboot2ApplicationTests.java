package com.example.springboot2;

import com.example.mappers.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot2ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

       int x= this.userService.selectNum();
        System.out.println("总数量："+x);

    }

}
