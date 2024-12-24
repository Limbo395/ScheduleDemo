package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Включаємо можливість використовувати @Scheduled
public class SpringAsyncDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAsyncDemoApplication.class, args);
    }
}