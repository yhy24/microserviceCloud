package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: yhy
 * @Date: 2018/8/3 18:09
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer 服务启动类，接收其他服务注册进来
public class SpringEureka_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringEureka_App.class, args);
    }
}
