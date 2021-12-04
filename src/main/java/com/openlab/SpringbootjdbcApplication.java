package com.openlab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.openlab.dao")
public class SpringbootjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootjdbcApplication.class, args);
    }

}
