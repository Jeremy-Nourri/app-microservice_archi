package com.example.app_microservice.infrastructure.springdata.repository;

import com.example.app_microservice.infrastructure.springdata.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
}
