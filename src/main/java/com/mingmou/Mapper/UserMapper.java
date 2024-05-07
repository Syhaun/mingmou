package com.mingmou.Mapper;

import com.mingmou.Pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //登录
    @Select("SELECT * from user where username = #{username} and password = #{password}")
    User getUserByUsernameAndPassword(User user);
//    注册
    @Insert("insert into user_information (username,password,gender,age,phone,address)"+
    "values(#{username},#{password},#{gender},#{age},#{phone},#{address})")
    void insert(User user);
//    查询用户名使用已经使用过了
    @Select("select * from user where username = #{username}")
    User getUserByUsername(String username);
}
