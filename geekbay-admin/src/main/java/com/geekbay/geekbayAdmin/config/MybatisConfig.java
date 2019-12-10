package com.geekbay.geekbayAdmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.geekbay.geekbayAdmin.model.mapper"})
public class MybatisConfig {
}