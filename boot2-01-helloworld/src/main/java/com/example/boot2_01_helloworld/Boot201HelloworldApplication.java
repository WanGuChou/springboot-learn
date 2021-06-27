package com.example.boot2_01_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot201HelloworldApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(Boot201HelloworldApplication.class, args);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
