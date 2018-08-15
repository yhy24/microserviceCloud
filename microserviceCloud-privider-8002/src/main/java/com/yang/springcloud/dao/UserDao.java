package com.yang.springcloud.dao;

import com.yang.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/3 14:39
 * @Version 1.0
 */
@Mapper
public interface UserDao {

    public List<User> get();

    public boolean add(User user);

    public User getUserById(Integer id);


}
