package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
    public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String loginPage(){
        return "loginPage";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String loginResult(String username,String password){
        User user=new User();
        user=this.userService.login(username,password);
        if (user==null)
        {
            return "error";
        }else{
            return "success";
        }

    }


}
