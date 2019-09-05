package com.feiyu.controller;

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

    @RequestMapping("/helloJava")
    public String hello(){
        return "Hello java! " ;
    }

    // 登录接口
    // @RequestParam 获取？后的参数
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
