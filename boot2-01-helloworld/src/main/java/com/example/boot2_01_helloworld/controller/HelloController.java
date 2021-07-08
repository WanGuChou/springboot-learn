package com.example.boot2_01_helloworld.controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@ImportResource("classpath:*.xml")
@RestController
public class HelloController {


    @RequestMapping("/")
    public String handle(){
        return "hello world";
    }
}
