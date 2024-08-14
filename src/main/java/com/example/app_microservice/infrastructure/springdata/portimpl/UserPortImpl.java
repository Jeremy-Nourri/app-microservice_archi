package com.example.app_microservice.infrastructure.springdata.portimpl;

import com.example.app_microservice.domain.entity.User;
import com.example.app_microservice.infrastructure.springdata.entity.UserEntity;
import com.example.app_microservice.infrastructure.springdata.repository.UserRepository;
import com.example.app_microservice.shared.dto.UserDTO;
import com.example.app_microservice.shared.port.UserPort;

import java.util.List;

public class UserPortImpl implements UserPort {

    private final UserRepository userRepository;

    public UserPortImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        UserEntity user = UserEntity.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .build();
        user = userRepository.save(user);
        return new UserDTO(user.getId(), user.getName(), user.getEmail());

    }

    @Override
    public List<UserDTO> findAll() {
        List<UserEntity> users = (List<UserEntity>) userRepository.findAll();
        return users.stream()
                .map(user -> new UserDTO(user.getId(), user.getName(), user.getEmail()))
                .toList();
    }
}
