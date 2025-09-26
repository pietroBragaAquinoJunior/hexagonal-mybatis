package com.pietro.hexagonal_mybatis.adapters.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.pietro.hexagonal_mybatis.adapters.outbound.persistence.batismapper")
public class MyBatisConfig {
}