package com.company.controller;

import com.company.config.ApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Resource
    private ApolloConfig apolloConfig;

    @GetMapping("/name")
    public String getName(){
        return apolloConfig.getName();
    }

    @GetMapping("/mysql")
    @ResponseBody
    public Map<Object,Object> getMysqlConfig(){
        Map<Object,Object> map=new LinkedHashMap<>();
        map.put("host",apolloConfig.getHost());
        map.put("port",apolloConfig.getPort());
        map.put("username",apolloConfig.getUsername());
        map.put("password",apolloConfig.getPassword());
        return map;
    }

}
