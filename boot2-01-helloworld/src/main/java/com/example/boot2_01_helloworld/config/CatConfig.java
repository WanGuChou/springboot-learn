package com.example.boot2_01_helloworld.config;

import com.example.boot2_01_helloworld.bean.Cat;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * class description<br/>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/6/30 17:06
 * @since JDK 1.8+
 */
@Import({MyCat.class})
@Configuration
public class CatConfig {
}
