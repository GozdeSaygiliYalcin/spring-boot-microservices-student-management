package com.gozdesy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentMainServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentMainServiceApplication.class, args);
    }
}