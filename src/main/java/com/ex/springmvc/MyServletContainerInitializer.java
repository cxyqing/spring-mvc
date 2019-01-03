package com.ex.springmvc;

import com.ex.springmvc.filter.UserFilter;
import com.ex.springmvc.service.UserService;
import com.ex.springmvc.servlet.UserServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

@HandlesTypes({UserService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
//        c.forEach(System.out::println);
//        ServletRegistration.Dynamic userServlet = ctx.addServlet("userServlet", new UserServlet());
//        userServlet.addMapping("/userServlet");
//        FilterRegistration.Dynamic userFilter = ctx.addFilter("userFilter", UserFilter.class);
//        userFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
//        ctx.addListener("com.ex.springmvc.listener.UserContextListener");

    }
}
