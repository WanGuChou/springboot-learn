package com.example.boot203servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@ServletComponentScan(basePackages = "com.example.boot203servlet")
@SpringBootApplication
public class Boot203ServletApplication {
  public static void main(String[] args) {
    SpringApplication.run(Boot203ServletApplication.class, args);
  }
}
