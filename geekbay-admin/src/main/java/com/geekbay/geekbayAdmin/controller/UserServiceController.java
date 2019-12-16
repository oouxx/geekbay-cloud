package com.geekbay.geekbayAdmin.controller;

import com.geekbay.geekbayAdmin.Entity.User;
import com.geekbay.geekbayAdmin.common.CommonResult;
import com.geekbay.geekbayAdmin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "UserService", tags = "UserServiceController")
@RestController
@RequestMapping("/user")
public class UserServiceController {
    @Autowired
    UserService userService;

    @GetMapping("/list/{id}")
    @ApiOperation("get one user by id")
    public CommonResult<User> getById(@PathVariable long id){
        User user = userService.getById(id);
        return CommonResult.success(user);
    }
    @GetMapping("/listAll")
    @ApiOperation("get all users")
    public CommonResult<List<User>> getAllUser(){
        List<User> users = userService.getAllUser();
        return CommonResult.success(users);
    }
}
