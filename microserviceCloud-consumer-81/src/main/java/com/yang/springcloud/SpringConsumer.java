package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: yhy
 * @Date: 2018/8/3 17:05
 * @Version 1.0
 */
@SpringBootApplication
@RibbonClient
@EnableEurekaClient
public class SpringConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringConsumer.class, args);
    }
}
