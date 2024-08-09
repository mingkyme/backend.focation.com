package com.focation.backend.user.domain.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostUserDTO {
    private String uuid;
    private String email;
    private String name;
    private String password;

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
