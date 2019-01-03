package com.ex.springmvc.config;

import com.ex.springmvc.interceptor.UserInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

@ComponentScan(basePackages = {"com.ex.springmvc"},includeFilters = {@ComponentScan.Filter(classes = {Controller.class})},useDefaultFilters = false)
//@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    public AppConfig(){
        System.out.println("AppConfig...Constructor...");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new UserInterceptor());
        registration.addPathPatterns("/**").excludePathPatterns("/user");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
