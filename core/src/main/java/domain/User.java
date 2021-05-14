package domain;

import enuns.Permission;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private Permission permission;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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
