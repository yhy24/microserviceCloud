package com.yang.springcloud.service.impl;

import com.yang.springcloud.dao.UserDao;
import com.yang.springcloud.entity.User;
import com.yang.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/3 15:00
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<User> get() {
        return userDao.get();
    }

    public boolean add(User user) {
        return userDao.add(user);
    }

    public User getUser(Integer id) {
        return userDao.getUserById(id);
    }

}
