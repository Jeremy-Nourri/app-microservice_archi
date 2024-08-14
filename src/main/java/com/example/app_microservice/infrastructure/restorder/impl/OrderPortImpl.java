package com.example.app_microservice.infrastructure.restorder.impl;

import com.example.app_microservice.domain.entity.Order;
import com.example.app_microservice.infrastructure.restorder.config.RestClient;
import com.example.app_microservice.shared.dto.OrderDTO;
import com.example.app_microservice.shared.port.OrderPort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderPortImpl implements OrderPort {

    private final RestClient<OrderDTO[], OrderDTO> restClient;

    public OrderPortImpl(RestClient<OrderDTO[], OrderDTO> commentDTOs, RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public List<OrderDTO> findAll(int userId) {
        return Arrays.stream(restClient.get("orders/" + userId, OrderDTO[].class))
                .toList();
    }
}
