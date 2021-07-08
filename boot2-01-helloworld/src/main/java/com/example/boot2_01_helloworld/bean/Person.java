package com.example.boot2_01_helloworld.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/6/30 16:11
 * @since JDK 1.8+
 */
@Data
@ConfigurationProperties("person")
public class Person {
  private String name;
  private int age;
}
