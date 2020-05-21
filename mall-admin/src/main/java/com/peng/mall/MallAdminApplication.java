package com.peng.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 入口函数
 * Created by peng on 2020/5/3.
 */
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class MallAdminApplication {
    public static void main(String[] args){ SpringApplication.run(MallAdminApplication.class); }
}
