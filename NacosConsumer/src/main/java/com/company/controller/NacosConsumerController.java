package com.company.controller;

import com.company.feign.UserFeign;
import com.company.model.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/nacos")
public class NacosConsumerController {

    @Resource
    public UserFeign userFeign;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userFeign.login(user);
    }
}
