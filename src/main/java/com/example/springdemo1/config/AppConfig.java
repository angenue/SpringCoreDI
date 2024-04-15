package com.example.springdemo1.config;

import com.example.springdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("#{studentServiceImpl.getStudentById(1).name}")
    private String studentName;

    @Bean
    public String welcomeMessage() {
        return "Welcome, " + studentName;
    }
}
