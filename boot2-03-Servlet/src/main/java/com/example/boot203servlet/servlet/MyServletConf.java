package com.example.boot203servlet.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class MyServletConf {

  @Bean
  public ServletRegistrationBean servletRegistrationBean() {
    ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(), "/my");
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean registrationBean = new FilterRegistrationBean(new MyFilter());
    registrationBean.setUrlPatterns(Collections.singleton("/my"));
    return registrationBean;
  }

  @Bean
  public ServletListenerRegistrationBean servletListenerRegistrationBean() {
    ServletListenerRegistrationBean registrationBean =
        new ServletListenerRegistrationBean(new MyListener());
    return registrationBean;
  }
}
