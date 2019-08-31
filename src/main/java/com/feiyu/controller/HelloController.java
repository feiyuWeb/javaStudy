package com.feiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody // @ResponseBody 注解把return值赋给body
    @RequestMapping("/hello")
    public String hello(){
        return "Hello java!";
    }
}
