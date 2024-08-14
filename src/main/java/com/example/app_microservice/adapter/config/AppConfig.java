package com.example.app_microservice.adapter.config;

import com.example.app_microservice.domain.service.UserService;
import com.example.app_microservice.infrastructure.springdata.portimpl.UserPortImpl;
import com.example.app_microservice.infrastructure.springdata.repository.UserRepository;
import com.example.app_microservice.shared.port.OrderPort;
import com.example.app_microservice.shared.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private final UserRepository userRepository;
    private final OrderPort orderPort;

    @Autowired
    public AppConfig(UserRepository userRepository, OrderPort orderPort) {
        this.userRepository = userRepository;
        this.orderPort = orderPort;
    }

    @Bean
    public UserService userService() {
        return new UserService(userPort(), orderPort);
    }

    @Bean
    public UserPort userPort() {
        return new UserPortImpl(userRepository);
    }

}
