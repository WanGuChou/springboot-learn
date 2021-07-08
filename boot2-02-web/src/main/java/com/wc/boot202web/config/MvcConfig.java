package com.wc.boot202web.config;

import com.wc.boot202web.bean.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * class description<br/>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/7 14:42
 * @since JDK 1.8+
 */
@Configuration
public class MvcConfig {

    @Bean
    public Converter<String, Phone> str2Pone() {
        return new Converter<String, Phone>() {
            @Override
            public Phone convert(String s) {
                Phone phone = new Phone();
                phone.setPrefix(s.split("-")[0]);
                phone.setSubfix(s.split("-")[1]);
                return phone;
            }
        };
    }


//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addFormatters(FormatterRegistry registry) {
//                registry.addConverter(new Converter<String, Phone>() {
//                    @Override
//                    public Phone convert(String s) {
//                        Phone phone = new Phone();
//                        phone.setPrefix(s.split("-")[0]);
//                        phone.setSubfix(s.split("-")[1]);
//                        return phone;
//                    }
//                });
//            }
//        };
//    }


}
