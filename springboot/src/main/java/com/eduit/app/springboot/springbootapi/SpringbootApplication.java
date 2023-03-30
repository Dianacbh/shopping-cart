package com.eduit.app.springboot.springbootapi;


import com.eduit.app.springboot.conf.AppConfig;
import com.eduit.app.springboot.service.UserInitializationService;
import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.eduit.bootcamp.springbootapi.api", "com.eduit.bootcamp.springbootapi.controller"})
 @Import({AppConfig.class, SwaggerConfig.class})


public class SpringbootApplication {

	public class SpringbootApiApplication implements CommandLineRunner {

		public void main(String[] args) {
			ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootApiApplication.class, args);
		}

		@Autowired
		private ApplicationContext context;

		@Override
		public void run(String... args) throws Exception {
			UserInitializationService userInitService = context.getBean(UserInitializationService.class);
			userInitService.createDefaultAdminUser();
		}

	}
}
