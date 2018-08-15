package com.yang.springcloud.controller;

import com.yang.springcloud.entity.User;
import com.yang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yhy
 * @Date: 2018/8/6 16:52
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    DeptClientService service;
    @RequestMapping(value = "/user/get/{id}")
    public User testUser(@PathVariable("id") Integer id) {
        return service.get(id);
    }



}
