package com.code.api.controller.user.request;

import domain.User;

public class UserRequest {
    private String name;

    public String getName() {
        return name;
    }

    public User toUser(){
        var user = new User(name);
        return user;
    }
}
