package com.feiyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    // 查询员工列表
    @GetMapping(value="/user/list")
    public String List(){
        return "[]";
    }
}
