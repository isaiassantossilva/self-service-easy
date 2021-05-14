package com.code.api.controller.user.request;

import domain.User;

public class UserRequest {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User toUser(){
        return new User(name, email, password);
    }
}
