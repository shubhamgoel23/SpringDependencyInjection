package com.spring.didemo.config;

import com.spring.didemo.model.FakeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${org.username}") // spring expression lang
    String user;

    @Value("${org.password}")
    String password;

    @Value("${org.url}")
    String url;

    @Bean
    public FakeDatasource fakeDatasource (){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(user);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        return  fakeDatasource;
    }

    @Bean //this bean help us  to wire up by value
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}