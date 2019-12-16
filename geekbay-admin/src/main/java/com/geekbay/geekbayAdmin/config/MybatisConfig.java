package com.geekbay.geekbayAdmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.geekbay.geekbayAdmin.dao"})
public class MybatisConfig {
}