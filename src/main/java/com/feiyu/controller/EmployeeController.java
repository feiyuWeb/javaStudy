package com.feiyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    // 查询员工列表
    @GetMapping("/user/list")
    public String List(){
        return "[{name:'hello'}]";
    }

    // 获取path上的参数
    @GetMapping("/user/{id}")
    public String getId(@PathVariable("id") String id){
        return "user path id is " + id;
    }

}
