package com.yang.springcloud.controller;

import com.yang.springcloud.entity.User;
import com.yang.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/3 14:41
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/gets")
    public String testGet() {
        List<User> users = userService.get();
        return users.toString();
    }

    @PostMapping("/add")
    public boolean add(User user) {
        user = new User();
        user.setAge(13);
        user.setEmail("9897@com");
        user.setUsername("xiaoniao");
        user.setPassword("654");
        user.setGender("b");
        return userService.add(user);
    }

    @RequestMapping("/getId/{id}")
    public String getId(@PathVariable("id") Integer id) {
        return userService.getUser(id).toString();
    }






}
