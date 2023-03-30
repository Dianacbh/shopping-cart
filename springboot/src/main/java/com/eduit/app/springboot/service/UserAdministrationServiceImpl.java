package com.eduit.app.springboot.service;

import com.eduit.app.springboot.entity.UserEntity;
import com.eduit.app.springboot.model.UserDTO;
import com.eduit.app.springboot.model.UserRequestDTO;
import com.eduit.app.springboot.repository.UserRepository;
import com.eduit.app.springboot.service.mapper.UserMapper;
import org.apache.commons.lang3.Validate;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class UserAdministrationServiceImpl extends UserAdministrationService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(UserAdministrationServiceImpl.class);

    private UserRepository userRepository;

    private UserMapper userMapper;

    public UserAdministrationServiceImpl(UserMapper theUserMapper, UserRepository theUserRepository) {
        userRepository = theUserRepository;
        userMapper = theUserMapper;
    }

    @Override
    public List<UserDTO> retrieveAll() throws RuntimeException {
        LOGGER.info(String.format("Listing all users"));
        Iterable<UserEntity> users = userRepository.findAll();
        Iterator<UserEntity> iter = users.iterator();
        List<UserDTO> response = new ArrayList<>();
        while (iter.hasNext()) {
            response.add(userMapper.map(iter.next()));
        }
        return response;
    }

    @Override
    public UserDTO retrieve(Long id) throws RuntimeException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDTO create(UserRequestDTO theUser) throws RuntimeException {
        Validate.notNull(theUser, "The user cannot be null.");
        LOGGER.info(String.format("Creating user with attributes: %s", theUser.toString()));
        UserEntity toCreate = userMapper.mapEncoded(theUser);
        UserEntity created = userRepository.save(toCreate);
        return userMapper.map(created);
    }

    @Override
    public UserDTO update(UserDTO element) throws RuntimeException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) throws RuntimeException {
        // TODO Auto-generated method stub

    }
}