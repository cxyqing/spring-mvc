package com.ex.springmvc.config;

import com.ex.springmvc.beanpostprocessor.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@ComponentScan(basePackages = {"com.ex.springmvc"},excludeFilters = {@ComponentScan.Filter(classes = {Controller.class})})
//@Configuration
public class RootConfig {

    public RootConfig(){
        System.out.println("RootConfig...constructor...");
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){

        return new MyBeanPostProcessor();
    }
}
