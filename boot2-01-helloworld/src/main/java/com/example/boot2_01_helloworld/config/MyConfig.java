package com.example.boot2_01_helloworld.config;

import com.example.boot2_01_helloworld.bean.Cat;
import com.example.boot2_01_helloworld.bean.Person;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * class description<br/>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/6/30 16:14
 * @since JDK 1.8+
 */
@EnableConfigurationProperties(Person.class)
@Configuration
public class MyConfig {
}
