package com.eduit.app.springboot.service;

import com.eduit.app.springboot.model.UserDTO;
import com.eduit.app.springboot.model.UserRequestDTO;

import java.util.List;

public abstract class UserAdministrationService {
    public List<UserDTO> retrieveAll() {
        return null;
    }

    public abstract UserDTO retrieve(Long id) throws RuntimeException;

    public UserDTO create(UserRequestDTO userDTO) {
        return null;
    }

    public abstract UserDTO update(UserDTO element) throws RuntimeException;

    public abstract void delete(Long id) throws RuntimeException;
}