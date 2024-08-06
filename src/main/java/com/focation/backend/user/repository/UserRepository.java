package com.focation.backend.user.repository;

import com.focation.backend.user.domain.dto.PostUserDTO;
import com.focation.backend.user.domain.entity.User;
import org.springframework.stereotype.Repository;
import com.focation.backend.user.domain.dto.GetUserDTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users;
    public UserRepository() {
        users = new ArrayList<>();
    }

    public PostUserDTO registerUser(PostUserDTO postUserDTO) {
        User tempUser = new User(postUserDTO.getEmail(), postUserDTO.getName(), postUserDTO.getPassword());
        users.add(tempUser);
        return postUserDTO;
    }
    public GetUserDTO getUserByUuid(String uuid) {
        GetUserDTO getUserDTO = null;
        for (User user : users) {
            if (user.getUuid() == uuid){
                getUserDTO = new GetUserDTO(user.getUuid(),user.getEmail(),user.getName(),user.getPassword());
                break;
            }
        }

        return getUserDTO;
    }
}
