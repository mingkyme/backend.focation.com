package com.focation.backend.user.domain.dto;

public class PostUserDTO {
    private String uuid;
    private String email;
    private String name;
    private String password;

    public PostUserDTO(String email, String name, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public PostUserDTO(String uuid,String email, String name, String password){
        this.uuid = uuid;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
