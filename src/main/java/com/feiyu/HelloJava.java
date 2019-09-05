package com.feiyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
* */
@SpringBootApplication
@MapperScan(basePackages = {"com.feiyu.mapper"})
public class HelloJava {
    public static void main(String[] args) {
        // Spring应用运行起来
        SpringApplication.run(HelloJava.class,args);
    }
}
