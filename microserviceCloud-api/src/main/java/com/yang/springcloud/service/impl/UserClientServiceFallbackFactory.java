package com.yang.springcloud.service.impl;

import com.yang.springcloud.entity.User;
import com.yang.springcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;

/**
 * @Author: yhy
 * @Date: 2018/8/6 18:07
 * @Version 1.0
 */
public class UserClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
/*hystrix这里使用接口的方法进行解耦*/
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public User get(Integer id) {
                User user = new User();
                user.setId(id);
                user.setUsername("没有该--id--"+"信息为空");
                return user;
            }
        };
    }
}
