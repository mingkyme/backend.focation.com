package com.focation.backend.user.domain.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetUserDTO {
    public String uuid;
    public String email;
    public String name;
}
