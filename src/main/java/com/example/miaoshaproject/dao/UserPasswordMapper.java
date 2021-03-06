package com.example.miaoshaproject.dao;

import com.example.miaoshaproject.dataobject.UserPassword;
import org.apache.ibatis.annotations.Mapper;


public interface UserPasswordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    int insert(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    int insertSelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    UserPassword selectByPrimaryKey(Integer id);

    UserPassword selectByUserId(Integer UserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun Jun 02 13:21:37 GMT+08:00 2019
     */
    int updateByPrimaryKey(UserPassword record);
}