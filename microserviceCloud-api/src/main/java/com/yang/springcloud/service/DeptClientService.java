package com.yang.springcloud.service;

import com.yang.springcloud.entity.User;
import com.yang.springcloud.service.impl.UserClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yhy
 * @Date: 2018/8/6 16:44
 * @Version 1.0
 * 使用feign的负载均衡
 */
@FeignClient(value = "microserviceCloud-user",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable("id") Integer id);
}
