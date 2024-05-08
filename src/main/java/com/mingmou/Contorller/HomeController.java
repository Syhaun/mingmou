package com.mingmou.Contorller;
import com.mingmou.Pojo.Health;
import com.mingmou.Pojo.Life;
import com.mingmou.Pojo.Result;
import com.mingmou.Pojo.User;
import com.mingmou.Service.HomeService;
import com.mingmou.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/Home")
public class HomeController {
    @Autowired
    private HomeService homeService;
    @PostMapping("/health")
    public Result health(@RequestBody Health health) {
        homeService.health(health);
        return Result.success();
    }
    @PostMapping("/life")
    public Result health(@RequestBody Life life) {
        homeService.life(life);
        return Result.success();
    }

}
