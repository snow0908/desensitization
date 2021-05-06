package com.snow.desensitize.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
@MapperScan(basePackages = "com.snow.desensitize.dao")
public class MyBatisPlusConfig {
}
