package com.ex.springmvc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class UserContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("UserContextListener...contextInitialized...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("UserContextListener...contextDestroyed...");
    }
}
