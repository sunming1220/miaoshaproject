package com.example.miaoshaproject.controller;

import com.example.miaoshaproject.response.Response;
import com.example.miaoshaproject.service.UserService;
import com.example.miaoshaproject.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public Response getUser(@RequestParam("id") Integer id){

        //调用service服务获取对应ID的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
        return new Response(200,"success",userModel);
    }
}
