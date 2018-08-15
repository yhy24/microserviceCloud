package com.yang.springcloud.service;

import com.yang.springcloud.entity.User;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/3 15:00
 * @Version 1.0
 */
public interface UserService {

    public List<User> get();

    public boolean add(User user);

    public User getUser(Integer id);

}
