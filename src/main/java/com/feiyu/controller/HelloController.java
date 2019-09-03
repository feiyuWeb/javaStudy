package com.feiyu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
* @Controller
* @ResponseBody // @ResponseBody 注解把return值赋给body
* @RestController 就是@ResponseBody和@ResponseBody的组合
* */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/helloJava")
    public String hello(){
        return "Hello java! " + name;
    }

    // 登录接口
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
