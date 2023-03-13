package com.eduit.app.springboot;


import conf.AppConfig;
import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.eduit.bootcamp.springbootapi.api", "com.eduit.bootcamp.springbootapi.controller"})
 @Import({AppConfig.class, SwaggerConfig.class})


public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}

}
