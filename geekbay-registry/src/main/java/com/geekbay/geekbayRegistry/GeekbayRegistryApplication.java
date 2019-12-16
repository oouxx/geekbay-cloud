package com.geekbay.geekbayRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GeekbayRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekbayRegistryApplication.class, args);
    }

}
