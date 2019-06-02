package com.example.miaoshaproject.service.impl;

import com.example.miaoshaproject.dao.UserInfoMapper;
import com.example.miaoshaproject.dao.UserPasswordMapper;
import com.example.miaoshaproject.dataobject.UserInfo;
import com.example.miaoshaproject.dataobject.UserPassword;
import com.example.miaoshaproject.service.UserService;
import com.example.miaoshaproject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserPasswordMapper userPasswordMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if (userInfo == null) {
            return null;
        }
        UserPassword userPassword = userPasswordMapper.selectByUserId(userInfo.getId());
        return convertFromDataObject(userInfo, userPassword);
    }

    private UserModel convertFromDataObject(UserInfo userInfo, UserPassword userPassword) {
        if (userInfo == null) {
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userInfo, userModel);
        if (userPassword != null) {

            userModel.setEncrptPassword(userPassword.getEncrptPassword());
        }

        return userModel;
    }
}
