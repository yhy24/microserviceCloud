package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yhy
 * @Date: 2018/8/3 14:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class springApplicationController {

    public static void main(String[] args) {
        SpringApplication.run(springApplicationController.class, args);
    }
}
