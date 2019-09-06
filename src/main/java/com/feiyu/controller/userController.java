package com.feiyu.controller;

import com.feiyu.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

//    @Autowired
//    private User user;

    @GetMapping("/user")
    public String findUser(){
        return "hello";
    }


    @PostMapping("/user")
    public User addUser(User user){
        return user;
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable("id") Integer id){
        return "";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        return "";
    }
}
