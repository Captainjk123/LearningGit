package com.mainapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mapper")
public class SpringBootMybatisApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApp.class, args);
    }

}
