package com.example.app_microservice.adapter.controller;

import com.example.app_microservice.domain.service.UserService;
import com.example.app_microservice.shared.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestParam String name, @RequestParam String email) {
        return ResponseEntity.ok(userService.save(name, email));

    }

    @GetMapping
    public ResponseEntity <List<UserDTO>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
