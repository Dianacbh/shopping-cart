package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

	Optional<UserEntity> findOneByUsername(String username);
}
