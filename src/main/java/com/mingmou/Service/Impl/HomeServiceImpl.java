package com.mingmou.Service.Impl;

import com.mingmou.Mapper.HomeMapper;
import com.mingmou.Pojo.Health;
import com.mingmou.Pojo.Life;
import com.mingmou.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeMapper homeMapper;
    @Override
    public void health(Health health) {
        homeMapper.insert_health(health);
    }

    @Override
    public void life(Life life) {
        homeMapper.insert_life(life);
    }
}
