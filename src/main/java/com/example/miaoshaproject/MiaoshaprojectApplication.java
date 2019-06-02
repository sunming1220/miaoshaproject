package com.example.miaoshaproject;

import com.example.miaoshaproject.dao.UserInfoMapper;
import com.example.miaoshaproject.dataobject.UserInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.miaoshaproject"})
@RestController
@MapperScan("com.example.miaoshaproject.dao")
public class MiaoshaprojectApplication {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/")
    public String home(){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        if(userInfo==null){
            return "用户不存在";
        }else {

            return userInfo.getName();
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(MiaoshaprojectApplication.class, args);
    }

}
