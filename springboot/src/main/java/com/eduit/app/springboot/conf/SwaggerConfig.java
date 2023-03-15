package com.eduit.app.springboot.conf;


import org.springdoc.core.SpringDocConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

    @Configuration
    @Import(SpringDocConfiguration.class)
    public class SwaggerConfig {


    }
