package com.eduit.app.springboot.service;

import java.util.Map;

public interface UserAuthenticationService {

    Map<String, String> login(final String userName, final String password);
}

