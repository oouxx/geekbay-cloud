package com.geekbay.geekaycloud.geekbaydemo1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("geekay-admin")
public interface UserService {

    @GetMapping("/hello")
    String hello();
}
