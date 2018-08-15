package com.yang.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yhy
 * @Date: 2018/8/3 17:07
 * @Version 1.0
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced // 进行负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

/*进行ribbon的轮询*/
    @Bean
    public IRule iRule() {
//        进行按顺序的轮询
//        return new RoundRobinRule();
//        进行出错的话进行不轮询
//        return new RetryRule();
//        进行随机的轮询
        return new RandomRule();
    }



}
