package com.example.datademo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Collections;

//@Configuration
public class DruidConfig {

  @Bean
  @ConfigurationProperties("spring.datasource")
  public DataSource dateSource() throws SQLException {
    DruidDataSource druidDataSource = new DruidDataSource();
    druidDataSource.setFilters("stat,wall");
    return druidDataSource;
  }

  @Bean
  public ServletRegistrationBean<StatViewServlet> statViewServlet() {
    //打开Druid的监控统计功能
    StatViewServlet statViewServlet = new StatViewServlet();
    ServletRegistrationBean<StatViewServlet> registrationBean =
        new ServletRegistrationBean(statViewServlet, "/druid/*");
    //设置登录
    registrationBean.addInitParameter("loginUsername","druid");
    registrationBean.addInitParameter("loginPassword","druid");

    return registrationBean;
  }
  @Bean
  public FilterRegistrationBean DruidWebStatFilter(){
    //配置_配置WebStatFilter
    WebStatFilter webStatFilter=new WebStatFilter();
    //配置profileEnable能够监控单个url调用的sql列表
    webStatFilter.setProfileEnable(true);
    FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
    filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
    filterRegistrationBean.setFilter(webStatFilter);
    filterRegistrationBean.setUrlPatterns(Collections.singleton("/*"));
    return filterRegistrationBean;
  }
}
