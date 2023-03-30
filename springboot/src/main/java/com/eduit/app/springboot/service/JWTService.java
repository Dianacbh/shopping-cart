package com.eduit.app.springboot.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JWTService {

    public static final String ACCESS_TOKEN_HEADER = "access_token";
    public static final String REFRESH_TOKEN_HEADER = "refresh_token";

    Map<String, String> generateTokenSet(final UserDetails user);

    Map<String, String> validateRefreshToken(final String refreshToken);
}
