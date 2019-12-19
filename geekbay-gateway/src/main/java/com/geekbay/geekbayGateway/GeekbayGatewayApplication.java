package com.geekbay.geekbayGateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

//@Slf4j
@EnableZuulProxy
//@EnableFeignClients
@EnableDiscoveryClient
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableHystrix                // 开启断路器
//@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = {"com.geekbay.geekbayGateway", "com.geekbay.geekbayCommon.bean"})
public class GeekbayGatewayApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GeekbayGatewayApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
