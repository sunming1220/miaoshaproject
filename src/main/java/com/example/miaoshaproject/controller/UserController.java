package com.example.miaoshaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("user")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get")
    public void getUser(@RequestParam("id") Integer id){

        //调用service服务获取对应ID的用户对象并返回给前端

    }
}
