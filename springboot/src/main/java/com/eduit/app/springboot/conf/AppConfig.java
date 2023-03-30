package com.eduit.app.springboot.conf;


import com.eduit.app.springboot.controller.ProductController;
import com.eduit.app.springboot.controller.TokenController;
import com.eduit.app.springboot.controller.UserController;
import com.eduit.app.springboot.repository.CategoryRepository;
import com.eduit.app.springboot.repository.ProductRepository;
import com.eduit.app.springboot.repository.UserRepository;
import com.eduit.app.springboot.securityFilter.JwtTokenUtil;
import com.eduit.app.springboot.service.*;
import com.eduit.app.springboot.service.mapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {
    @Bean
    public UserAdministrationService getUserAdministrationService(UserMapper userMapper,
                                                                  UserRepository userRepository) {
        return new UserAdministrationServiceImpl(userMapper, userRepository);
    }

    @Bean
    public UserMapper getUserMapper(PasswordEncoder encoder) {
        return new UserMapperImpl(encoder);
    }

    @Bean
    public ProductMapper getProductMapper(CategoryMapper categoryMapper) {
        return new ProductMapperImpl(categoryMapper);
    }

    @Bean
    public CategoryMapper getCategoryMapper(CategoryRepository categoryRepository) {
        return new CategoryMapperImpl(categoryRepository);
    }

    @Bean
    public UserController getUserController(UserAdministrationService userAdministrationService) {
        return new UserController(userAdministrationService);
    }

    @Bean
    public TokenController getTokenController(UserAuthenticationService userAuthenticationService,
                                              JWTService jwtService) {
        return new TokenController(userAuthenticationService, jwtService);
    }

    @Bean
    public ProductController getProductController(CategoryAdministrationService categoryAdministrationService,
                                                  ProductAdministrationService productAdministrationService) {
        return new ProductController(categoryAdministrationService, productAdministrationService);
    }

    @Bean
    public JWTService getJwtService(UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil) {
        return new JWTServiceImpl(userDetailsService, jwtTokenUtil);
    }

    @Bean
    public UserAuthenticationService getUserAuthenticationService(PasswordEncoder passwordEncoder,
                                                                  JWTService jwtService, UserDetailsService userDetailsService) {
        return new UserAuthenticationServiceImpl(passwordEncoder, jwtService, userDetailsService);
    }

    @Bean
    public UserDetailsService getUserDetailService(UserRepository userRepository) {
        return new UserDetailServiceImpl(userRepository);
    }

    @Bean
    public CategoryAdministrationService getCategoryAdministrationService(CategoryMapper categoryMapper,
                                                                          CategoryRepository categoryRepository) {
        return new CategoryAdministrationServiceImpl(categoryMapper, categoryRepository);
    }

    @Bean
    public ProductAdministrationService getProductAdministrationService(ProductMapper productMapper,
                                                                        ProductRepository productRepository) {
        return new ProductAdministrationServiceImpl(productMapper, productRepository);
    }

    @Bean
    public UserInitializationService getUserInitializationService(PasswordEncoder passwordEncoder,
                                                                  UserRepository userRepository) {
        return new UserInitializationServiceImpl(passwordEncoder, userRepository);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}