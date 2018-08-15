package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: yhy
 * @Date: 2018/8/6 16:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yang.springcloud")
@ComponentScan(basePackages = "com.yang.springcloud")
public class SpringFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringFeign_App.class, args);
    }
}
