package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user/info")
    public String user(){
        return "/user/userinfo.html";
    }

//    @RequestMapping("/user/info") //same mapping -> throw exception
//    public String user2(){
//        return "home.html";
//    }
}
