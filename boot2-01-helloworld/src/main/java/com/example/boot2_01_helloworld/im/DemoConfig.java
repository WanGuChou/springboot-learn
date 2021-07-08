package com.example.boot2_01_helloworld.im;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * class description<br/>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/6/30 17:25
 * @since JDK 1.8+
 */
@Configuration
@Import({Demo1.class,Demo2Im.class,Demo3Im.class})
public class DemoConfig {
}
