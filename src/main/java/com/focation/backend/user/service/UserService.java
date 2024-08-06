package com.focation.backend.user.service;

import com.focation.backend.user.domain.dto.GetUserDTO;
import com.focation.backend.user.domain.dto.PostUserDTO;
import com.focation.backend.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
    }

    public GetUserDTO getUser(String uuid){
        return userRepository.getUserByUuid(uuid);
    }

    public PostUserDTO postUser(PostUserDTO postUserDTO) {
        return userRepository.registerUser(postUserDTO);
    }
}
