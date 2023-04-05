package com.eduit.app.springboot.service;

import com.eduit.app.springboot.entity.UserEntity;
import com.eduit.app.springboot.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserInitializationServiceImpl implements UserInitializationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInitializationServiceImpl.class);

    private UserRepository userRepository;

    private PasswordEncoder encoder;

    @Value("${api.defaultuser.username}")
    private String userName;
    @Value("${api.defaultuser.password}")
    private String password;
    @Value("${api.defaultuser.name}")
    private String name;
    @Value("${api.defaultuser.lastname}")
    private String lastname;
    @Value("${api.defaultuser.email}")
    private String email;

    public UserInitializationServiceImpl(PasswordEncoder theEncoder, UserRepository theUserRepository) {
        userRepository = theUserRepository;
        encoder = theEncoder;
    }

    @Override
    public void createDefaultAdminUser() {
        if (userRepository.count() == 0) {
            UserEntity adminUser = new UserEntity();
            adminUser.setFirstName(name);
            adminUser.setLastName(lastname);
            adminUser.setEmail(email);
            adminUser.setUserName(userName);
            adminUser.setRole(UserRoleEnum.ROLE_ADMIN);
            adminUser.setPassword(encoder.encode(password));
            adminUser.setDateCreated(new Date());
            userRepository.save(adminUser);
        }

    }

}

