package com.company;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
/**
 * @EnableCircuitBreaker - 开启断路器。就是开启hystrix服务容错能力。
 *   当应用启用Hystrix服务容错的时候，必须增加的一个注解。
 */
@EnableCircuitBreaker
@EnableApolloConfig
@EnableDiscoveryClient
public class NacosConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(NacosConsumerApplication.class,args);
    }
}
