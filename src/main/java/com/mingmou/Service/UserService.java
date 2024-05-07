package com.mingmou.Service;

import com.mingmou.Pojo.User;

public interface UserService {
    User login(User user);
    void register(User user);
}
