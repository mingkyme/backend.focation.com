package com.focation.backend.user.controller;

import com.focation.backend.common.excepction.repository.DBNotFoundException;
import com.focation.backend.user.domain.dto.GetUserDTO;
import com.focation.backend.user.domain.dto.PostUserDTO;
import com.focation.backend.user.domain.request.PostUserRequest;
import com.focation.backend.user.domain.response.GetUserResponse;
import com.focation.backend.user.domain.response.PostUserResponse;
import com.focation.backend.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{uuid}")
    public ResponseEntity<GetUserResponse> getUser(@PathVariable("uuid") String uuid) throws DBNotFoundException {
        try {
            GetUserResponse getUserResponse = new GetUserResponse();
            GetUserDTO getUserDTO = userService.getUser(uuid);
            getUserResponse.setUuid(getUserDTO.uuid);
            getUserResponse.setEmail(getUserDTO.email);
            getUserResponse.setName(getUserDTO.name);
            return ResponseEntity.ok(getUserResponse);
        }catch (DBNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/users")
    public ResponseEntity<PostUserResponse> createUser(@RequestBody PostUserRequest postUserRequest) {
        PostUserDTO postUserDTO = new PostUserDTO(postUserRequest.getEmail(), postUserRequest.getName(), postUserRequest.getPassword(),null);
        userService.postUser(postUserDTO);
        PostUserResponse postUserResponse = new PostUserResponse();
        postUserResponse.setUuid(postUserDTO.getUuid());
        postUserResponse.setEmail(postUserDTO.getEmail());
        postUserResponse.setName(postUserDTO.getName());
        return ResponseEntity.ok(postUserResponse);
    }
}
