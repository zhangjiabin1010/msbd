package com.z.msbd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.z.msbd")
public class MsbdApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsbdApplication.class, args);
    }

}
