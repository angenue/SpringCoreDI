package com.example.springdemo1.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String welcomeMessage = context.getBean("welcomeMessage", String.class);
        System.out.println(welcomeMessage);

        context.close();
    }
}
