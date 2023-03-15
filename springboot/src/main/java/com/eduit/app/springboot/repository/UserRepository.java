package com.eduit.app.springboot.repository;

import com.eduit.app.springboot.entity.UserEntity;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository <UserEntity, Long> {

    UserEntity findOneByUserName(String userName);
}
