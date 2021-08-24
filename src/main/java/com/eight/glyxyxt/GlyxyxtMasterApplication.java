package com.eight.glyxyxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("com.eight.glyxyxt.mapper")
public class GlyxyxtMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlyxyxtMasterApplication.class, args);

        System.out.println("首页1地址：http://localhost:8085/eight/");
        System.out.println("首页2地址：http://localhost:8085/eight/index");
    }

}
