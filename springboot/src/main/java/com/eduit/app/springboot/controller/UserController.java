package com.eduit.app.springboot.controller;

import com.eduit.app.springboot.api.UsersApiController;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;

public class UserController extends UsersApiController {

    public UserController(ObjectMapper objectMapper, HttpServletRequest request) {
        super(objectMapper, request);
    }
}