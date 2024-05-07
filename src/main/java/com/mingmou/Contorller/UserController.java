package com.mingmou.Contorller;

import com.mingmou.Pojo.Result;
import com.mingmou.Pojo.User;
import com.mingmou.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        log.info("用户登录:{}",user);
        User e = userService.login(user);
        return e != null ? Result.success():Result.error("用户名或密码错误");
    }
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        try{userService.register(user);
            return Result.success();
        }catch (Exception exception) {
            return Result.error("注册失败:"+ exception.getMessage());
        }
    }
}
