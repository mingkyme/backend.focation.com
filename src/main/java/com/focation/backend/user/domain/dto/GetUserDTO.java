package com.focation.backend.user.domain.dto;

public class GetUserDTO {
    public String uuid;
    public String email;
    public String name;

    public GetUserDTO(String uuid, String email, String name, String password){
        this.uuid = uuid;
        this.email = email;
        this.name = name;
    }
}
