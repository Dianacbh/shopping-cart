package com.eduit.app.springboot.controller;

import com.eduit.app.springboot.model.JWTResponseDTO;
import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
import com.eduit.app.springboot.service.JWTService;
import com.eduit.app.springboot.service.UserAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class TokenController extends BaseController implements TokenApiDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(TokenController.class);

    private final UserAuthenticationService userAuthenticationService;
    private final JWTService jwtService;

    public TokenController(UserAuthenticationService theUserAuthenticationService,
                           JWTService theJwtService) {
        userAuthenticationService = theUserAuthenticationService;
        jwtService = theJwtService;
    }

    public ResponseEntity<ResponseContainerResponseDTO> login(String userName,
                                                              String password) {
        Long start = System.currentTimeMillis();
        LOGGER.debug("login");
        ResponseContainerResponseDTO response = new ResponseContainerResponseDTO();
        try {
            Map<String, String> tokens = userAuthenticationService.login(userName, password);
            return responseTokens(start, response, tokens);
        } catch (Exception e) {
            LOGGER.error(String.format("Login failed for user: \"%s\" pwd: \"%s\" ", userName, password), e);
            return buildErrorResponse(response, HttpStatus.BAD_REQUEST, e, "A1", start);
        }
    }

    public ResponseEntity<ResponseContainerResponseDTO> refreshToken(String authorization) {
        Long start = System.currentTimeMillis();
        ResponseContainerResponseDTO response = new ResponseContainerResponseDTO();
        LOGGER.debug("refreshToken");
        try {
            Map<String, String> tokens = jwtService.validateRefreshToken(authorization);
            return responseTokens(start, response, tokens);
        } catch (Exception e) {
            LOGGER.error(String.format("refreshToken failed for token: \"%s\" ", authorization), e);
            return buildErrorResponse(response, HttpStatus.BAD_REQUEST, e, "A1", start);
        }
    }

    private ResponseEntity<ResponseContainerResponseDTO> responseTokens(Long start,
                                                                        ResponseContainerResponseDTO response, Map<String, String> tokens) {
        HttpHeaders headers = new HttpHeaders();
        tokens.forEach((k, v) -> headers.add(k, v));
        JWTResponseDTO jwtResponse = new JWTResponseDTO();
        jwtResponse.setAccessToken(tokens.get(JWTService.ACCESS_TOKEN_HEADER));
        jwtResponse.setRefreshToken(tokens.get(JWTService.REFRESH_TOKEN_HEADER));
        response.setData(jwtResponse.getUser());
        response.setMeta(buildMeta(start));
        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(response);
    }
}
