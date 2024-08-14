package com.example.app_microservice.shared.port;

import com.example.app_microservice.shared.dto.OrderDTO;

import java.util.List;

public interface OrderPort {
    List<OrderDTO> findAll(int userId);
}
