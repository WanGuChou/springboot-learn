package com.wc.boot202web.config;

import com.wc.boot202web.bean.MyUser;
import com.wc.boot202web.bean.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                Map<String, MediaType> mediaTypes = new HashMap<>(3);
                mediaTypes.put("json", MediaType.APPLICATION_JSON);
                mediaTypes.put("xml", MediaType.APPLICATION_XML);
                mediaTypes.put("ac", MediaType.parseMediaType("application/ac"));
                configurer.strategies(Arrays.asList(new ParameterContentNegotiationStrategy(mediaTypes), new HeaderContentNegotiationStrategy()));
            }

            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters){
                converters.add(new HttpMessageConverter<MyUser>() {
                    @Override
                    public boolean canRead(Class<?> clazz, MediaType mediaType) {
                        return false;
                    }

                    @Override
                    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
                        return clazz.isAssignableFrom(MyUser.class);
                    }

                    @Override
                    public List<MediaType> getSupportedMediaTypes() {
                        return MediaType.parseMediaTypes("application/ac");
                    }

                    @Override
                    public MyUser read(Class<? extends MyUser> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
                        return null;
                    }

                    @Override
                    public void write(MyUser user, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
                        String data = user.toString();
                        outputMessage.getBody().write(data.getBytes());
                    }
                });
            }
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
        };
    }


}
