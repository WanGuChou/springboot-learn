package com.example.boot205actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Boot205ActuatorApplication {




  public static void main(String[] args) {
    SpringApplication.run(Boot205ActuatorApplication.class, args);
  }
}
