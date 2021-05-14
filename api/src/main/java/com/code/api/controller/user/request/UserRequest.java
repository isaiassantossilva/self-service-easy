package com.code.api.controller.user.request;

import domain.User;
import enuns.Permission;

public class UserRequest {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public User toUser(){
        return new User(name, email, password);
    }
}
