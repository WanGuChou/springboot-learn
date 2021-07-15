//package com.wc.boot202web;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.accept.ParameterContentNegotiationStrategy;
//
//import java.util.HashMap;
//
///**
// * class description<br>
// *
// * @author wangguocheng
// * @version 1.0
// * @date 2021/7/7 14:42
// * @since JDK 1.8+
// */
//@Configuration
//public class MvcConfig {
//
//  @Bean
//  public ParameterContentNegotiationStrategy parameterContentNegotiationStrategy() {
//      HashMap<String, MediaType> map = new HashMap<>();
//      map.put("json",MediaType.APPLICATION_JSON);
//      map.put("xml",MediaType.APPLICATION_XML);
//      map.put("ac",MediaType.parseMediaType("application/ac"));
//      ParameterContentNegotiationStrategy strategy = new ParameterContentNegotiationStrategy(map);
//      return strategy;
//  }
//}
