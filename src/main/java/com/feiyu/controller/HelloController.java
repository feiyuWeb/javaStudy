package com.feiyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Controller
* @ResponseBody // @ResponseBody 注解把return值赋给body
* @RestController 就是@ResponseBody和@ResponseBody的组合
* */
@RestController
public class HelloController {
    @RequestMapping("/helloJava")
    public String hello(){
        return "Hello java!";
    }
}
