package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
import com.eduit.app.springboot.model.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UsersApiDelegate {
        public abstract ResponseEntity<ResponseContainerResponseDTO> deleteUser(Long userId, UserDTO userDTO);

        public abstract ResponseEntity<ResponseContainerResponseDTO> retrieveUser(Long userId);

        public abstract ResponseEntity<ResponseContainerResponseDTO> updateUser(Long userId, UserDTO userDTO);
    }

