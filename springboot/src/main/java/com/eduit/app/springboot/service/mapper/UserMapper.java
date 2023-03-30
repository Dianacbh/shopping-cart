package com.eduit.app.springboot.service.mapper;

import com.eduit.app.springboot.entity.UserEntity;
import com.eduit.app.springboot.model.UserDTO;
import com.eduit.app.springboot.model.UserRequestDTO;

import java.text.ParseException;

public interface UserMapper {

    /**
     * This method create a UserEntity from given UserDTO.
     *
     * @param theUser the User DTO to extract data. It cannot be null.
     * @return The new user entity. Never null.
     */
    UserEntity map(final UserDTO theUser) throws ParseException;

    /**
     * This method create a UserEntity from given UserDTO.
     * This also encrypt the password to the destination entity.
     *
     * @param theUser the User DTO to extract data. It cannot be null.
     * @return The new user entity. Never null.
     */
    UserEntity mapEncoded(final UserDTO theUser);

    /**
     * This method create a UserEntity from given UserDTO.
     * This also encrypt the password to the destination entity.
     *
     * @param theUser the User DTO to extract data. It cannot be null.
     * @return The new user entity. Never null.
     */
    UserEntity mapEncoded(final UserRequestDTO theUser);

    UserDTO map(final UserEntity theUser);
}

