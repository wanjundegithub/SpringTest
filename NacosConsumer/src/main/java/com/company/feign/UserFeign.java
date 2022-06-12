package com.company.feign;

import com.company.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 微服务内部调用不用指定url，指定value即可；系统外部调用需指定url
 */
@FeignClient(value = "NacosServer", fallback = UserFeignFallBack.class)
public interface UserFeign {

    @PostMapping("/nacos/login")
    String login(User user);
}
