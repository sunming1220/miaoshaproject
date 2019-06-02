package com.example.miaoshaproject.controller;

import com.example.miaoshaproject.error.BusinessException;
import com.example.miaoshaproject.error.EmBusinessError;
import com.example.miaoshaproject.response.Response;
import com.example.miaoshaproject.service.UserService;
import com.example.miaoshaproject.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller("user")
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public Response getUser(@RequestParam("id") Integer id) throws BusinessException {

        //调用service服务获取对应ID的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
        //如果用户不存在
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        return new Response(200, "success", userModel);
    }

}
