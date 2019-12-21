package com.geekbay.geekaycloud.geekbaydemo1.controller;

import com.geekbay.geekaycloud.geekbaydemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @GetMapping("/haha")
    public String haha(){
        return userService.hello();
    }
}
