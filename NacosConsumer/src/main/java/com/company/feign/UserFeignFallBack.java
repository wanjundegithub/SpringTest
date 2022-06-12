package com.company.feign;

import com.company.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallBack implements UserFeign {
    @Override
    public String login(User user) {
        return "接口超时";
    }
}
