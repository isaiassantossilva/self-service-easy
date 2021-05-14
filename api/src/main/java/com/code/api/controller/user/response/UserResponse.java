package com.code.api.controller.user.response;

import domain.User;

public class UserResponse {

    private String id;

    public UserResponse(User user) {
        this.id = user.getId();
    }

    public String getId() {
        return id;
    }
}
