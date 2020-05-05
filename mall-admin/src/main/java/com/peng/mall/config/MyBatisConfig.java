package com.peng.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by peng on 2020/5/3.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.peng.mall.dao","com.peng.mall.mapper"})
public class MyBatisConfig {
}
