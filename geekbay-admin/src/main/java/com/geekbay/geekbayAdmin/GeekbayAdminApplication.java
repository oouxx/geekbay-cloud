package com.geekbay.geekbayAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GeekbayAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekbayAdminApplication.class, args);
    }

}
