package com.example.app_microservice.domain.service;

import com.example.app_microservice.shared.dto.UserDTO;
import com.example.app_microservice.shared.port.OrderPort;
import com.example.app_microservice.shared.port.UserPort;

import java.util.List;

public class UserService {

    private final UserPort userPort;
    private OrderPort orderPort;

    public UserService(UserPort userPort, OrderPort orderPort) {
        this.userPort = userPort;
        this.orderPort = orderPort;
    }

    public UserService(UserPort userPort) {
        this.userPort = userPort;
    }

    public UserDTO save(String name, String email) {
        UserDTO userDTO = new UserDTO(name, email);
        return userPort.save(userDTO);
    }

    public List<UserDTO> findAll() {
        List<UserDTO> usersDTO = userPort.findAll();
        usersDTO.forEach(userDTO -> userDTO.setOrderList(orderPort.findAll(userDTO.getUserId())));
        return usersDTO;
    }


}
