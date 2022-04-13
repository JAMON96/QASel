package com.jamon.qaseluser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jamon.qaseluser.mapper")
public class QaSelUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(QaSelUserApplication.class, args);
    }

}
