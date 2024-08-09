package com.focation.backend.user.service;

import com.focation.backend.common.excepction.repository.DBNotFoundException;
import com.focation.backend.user.domain.dto.GetUserDTO;
import com.focation.backend.user.domain.dto.PostUserDTO;
import com.focation.backend.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public GetUserDTO getUser(String uuid) throws DBNotFoundException {
        GetUserDTO getUserDTO = userRepository.getUserByUuid(uuid);
        if ( getUserDTO == null){
            throw new DBNotFoundException("Not Found with uuid " + uuid);
        }

        return userRepository.getUserByUuid(uuid);
    }

    public PostUserDTO postUser(PostUserDTO postUserDTO) {
        return userRepository.registerUser(postUserDTO);
    }
}
