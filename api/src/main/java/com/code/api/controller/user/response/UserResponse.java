package com.code.api.controller.user.response;

import domain.User;
import enuns.Permission;

public class UserResponse {

    private String id;
    private String name;
    private String email;
    private String password;
    private Permission permission;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.permission = user.getPermission();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Permission getPermission() {
        return permission;
    }
}
