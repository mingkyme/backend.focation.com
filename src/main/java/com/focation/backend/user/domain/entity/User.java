package com.focation.backend.user.domain.entity;
import java.util.UUID;

public class User {
    private String uuid;
    private String name;
    private String email;
    private String password;

    public User(String name,String email,String password){
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User(String uuid, String name,String email,String password){
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
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
}
