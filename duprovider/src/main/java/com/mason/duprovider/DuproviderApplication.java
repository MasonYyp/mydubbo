package com.mason.duprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DuproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuproviderApplication.class, args);
    }

}
