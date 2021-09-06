package com;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
@ConditionalOnMissingBean(MyService.class)
public class MyAutoConfigure {

	@Bean
	public MyService myService(){
		return new MyService();
	}
}
