package com.eduit.app.springboot.service;

import com.eduit.app.springboot.entity.UserEntity;
import com.eduit.app.springboot.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class UserDetailServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository theUserRepository) {
        userRepository = theUserRepository;
    }

    /**
     * Required to check authorities
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = findByUsername(username);
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(username));
        UserDetails userDetails = new User(user.getUserName(), user.getPassword(), authorities);
        return userDetails;
    }

    private UserEntity findByUsername(final String username) {
        Optional<UserEntity> opUsr = userRepository.findOneByUsername(username);
        if (opUsr.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return opUsr.get();
    }
}