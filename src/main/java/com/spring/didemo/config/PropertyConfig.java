package com.spring.didemo.config;

import com.spring.didemo.model.DatasourceBroker;
import com.spring.didemo.model.FakeDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:org.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:org.properties")
//})
public class PropertyConfig {
//
//    @Autowired
//    Environment env;

    @Value("${org.username}") // spring expression lang
    String user;

    @Value("${org.password}")
    String password;

    @Value("${org.url}")
    String url;

    @Value("${datasource.username}") // spring expression lang
    String dtuser;

    @Value("${datasource.password}")
    String dtpassword;

    @Value("${datasource.url}")
    String dturl;

    @Bean
    public FakeDatasource fakeDatasource (){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUser(user);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        return  fakeDatasource;
    }

    @Bean
    public DatasourceBroker datasourceBroker (){
        DatasourceBroker datasourceBroker = new DatasourceBroker();
        datasourceBroker.setUser(dtuser);
        datasourceBroker.setPassword(dtpassword);
        datasourceBroker.setUrl(dturl);
        return  datasourceBroker;
    }

//    @Bean //this bean help us  to wire up by value
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}
