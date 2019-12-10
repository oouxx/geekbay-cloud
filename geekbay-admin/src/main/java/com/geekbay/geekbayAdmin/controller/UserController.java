package com.geekbay.geekbayAdmin.controller;

import com.geekbay.geekbayAdmin.common.CommonResult;
import com.geekbay.geekbayAdmin.model.dao.User;
import com.geekbay.geekbayAdmin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public CommonResult<List<User>> getAllUser() {
        return CommonResult.success(userService.listAllUser());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createUser(@RequestBody User user) {
        CommonResult commonResult;
        int count = userService.createUser(user);
        if (count == 1) {
            commonResult = CommonResult.success(user);
            LOGGER.debug("create user success:{}", user);
        } else {
            commonResult = CommonResult.failed("operation failed");
            LOGGER.debug("create user fail:{}", user);
        }
        return commonResult;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public CommonResult deleteuser(@PathVariable Long id) {
        int count = userService.deleteUser(id);
        if (count == 1) {
            LOGGER.debug("delete user success id:{}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("delete user fail id:{}", id);
            return CommonResult.failed("operation failed");
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<User> getUser(@PathVariable Long id) {
        return CommonResult.success(userService.getUser(id));
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public CommonResult updateUser(@PathVariable Long id, @RequestBody User user) {
        int count = userService.updateUser(id, user);
        if (count == 1) {
            LOGGER.debug("update user success id:{}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("update user fail id:{}", id);
            return CommonResult.failed("operation failed");
        }
    }
}
