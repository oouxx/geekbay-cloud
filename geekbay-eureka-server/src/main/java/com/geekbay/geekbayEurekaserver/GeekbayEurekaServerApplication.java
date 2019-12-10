package com.geekbay.geekbayEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GeekbayEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeekbayEurekaServerApplication.class, args);
    }

}
