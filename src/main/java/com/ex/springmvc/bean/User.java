package com.ex.springmvc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String userName;
    @Value("${user.name}")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public User(){
        System.out.println("User...Constructor...");
    }
}
