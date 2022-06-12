package com.company.controller;

import com.company.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class NacosController {

    @PostMapping("/login")
    public String login(@RequestBody User user) throws InterruptedException {
        if(null==user|| StringUtils.isEmpty(user.getName())||StringUtils.isEmpty(user.getPassword())){
            return "failure:name or password is empty";
        }
        if(!"admin".equals(user.getName())||!"123456".equals(user.getPassword())){
            return "failure:name or password is unCorrect";
        }
        return "success";
    }
}
