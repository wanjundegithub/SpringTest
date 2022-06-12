package com.company.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApolloConfig {

    @Value("${name}")
    private String name;

    @Value("${mysql.host}")
    private String host;

    @Value("${mysql.port}")
    private String port;

    @Value("${mysql.username}")
    private String username;

    @Value("${mysql.password}")
    private  String password;
}
