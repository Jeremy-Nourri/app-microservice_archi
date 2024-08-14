package com.example.app_microservice.shared.port;

import com.example.app_microservice.shared.dto.UserDTO;

import java.util.List;

public interface UserPort {
    UserDTO save(UserDTO userDTO);
    List<UserDTO> findAll();
}
