package com.mingmou.Service.Impl;

import com.mingmou.Mapper.UserMapper;
import com.mingmou.Pojo.User;
import com.mingmou.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
//    用户登录
    @Override
    public User login(User user) {
        return userMapper.getUserByUsernameAndPassword(user);
    }
//  用户注册
    @Override
    public void register(User user) {
        if(!isValidPhoneNumber(user.getPhone())){
            throw new IllegalArgumentException("手机格式不正确");
        }
        if (isUsernameTaken(user.getUsername())){
            throw new IllegalArgumentException("用户名已使用");
        }
        userMapper.insert(user);
    }
//    查询手机号是否正确输入
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^(?:(?:\\+|00)86)?1[3-9]\\d{9}$");
    }
//    查询用户名是否使用过
    private boolean isUsernameTaken(String username) {
        User existingUser = userMapper.getUserByUsername(username);
        return existingUser != null;
    }
}
