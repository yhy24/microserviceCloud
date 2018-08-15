package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: yhy
 * @Date: 2018/8/3 14:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //开启hystrix熔断机制  版本冲突启动不了
public class SpringApplication_Hystrix_Controller {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Hystrix_Controller.class, args);
    }
}
