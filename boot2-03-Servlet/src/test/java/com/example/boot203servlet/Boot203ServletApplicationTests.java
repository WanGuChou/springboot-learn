package com.example.boot203servlet;

import org.apache.commons.csv.CSVFormat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

@SpringBootTest
class Boot203ServletApplicationTests {

  @Test
  void contextLoads() {

    try {
      CSVFormat.RFC4180
          .withFirstRecordAsHeader()
          .parse(
              new FileReader(
                  "D:\\wgc\\stu\\spring-boot2\\boot2-03-Servlet\\src\\main\\resources\\猎鹰距离.csv"))
          .forEach(
              strings -> {
                System.out.println(strings);
              });

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
