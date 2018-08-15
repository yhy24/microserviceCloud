package com.yang.springcloud.controller;

import com.yang.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.lang.Boolean.TRUE;

/**
 * @Author: yhy
 * @Date: 2018/8/3 17:13
 * @Version 1.0
 */
@RestController
public class ConsumerController {
    private static final String REST_URL_PREFIX = "http://localhost:8002";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer/user/add")
    public boolean add(User user) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/add", user, Boolean.class);
    }

    @RequestMapping("/consumer/user/get/{id}")
    public String get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX +"/getId/"+id, String.class);
    }

    @RequestMapping("/consumer/user/gets")
    public String gets() {
        return restTemplate.getForObject(REST_URL_PREFIX +"/gets", String.class);
    }

}
