package com.feiyu.config;

import com.feiyu.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置类
 * 在代替在配置文件中<bean><bean/>标签中添加组件
 * */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService Hello(){
        System.out.println("配置类@Bean添加组件了");
        return new HelloService();
    }
}
