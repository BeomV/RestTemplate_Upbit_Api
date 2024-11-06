package com.example.upbit_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UpbitApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpbitApiApplication.class, args);
    }

}
