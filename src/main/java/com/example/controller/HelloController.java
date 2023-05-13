package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {


    @GetMapping(value ="/index" )
    public String test(){
        return "index";
    }



    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
