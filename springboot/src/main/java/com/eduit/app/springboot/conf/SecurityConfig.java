package com.eduit.app.springboot.conf;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.Filter;
import java.util.logging.Logger;

@Configuration
@EnableWebSecurity
public class SecurityConfig<JwtTokenUtil> {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SecurityConfig.class);

   /* @Bean
    public void getJwtTokenUtil(@Value("${jwt.secret}") String secret) {
        return new JwtTokenUtil(secret);
    }*/

  /*  @Bean
    public <CustomAuthorizationFilter> CustomAuthorizationFilter getCustomAuthorizationFilter(ObjectMapper objectMapper, PasswordEncoder encoder,
                                                                                              UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil,
                                                                                              @Value("${api.basePath}") String basePath, @Value("${api.loginPath}") String loginPath,
                                                                                              @Value("${api.refreshTokenPath}") String refreshTokenPath){
       return new CustomAuthorizationFilter(objectMapper, userDetailsService, jwtTokenUtil, basePath, loginPath,
       refreshTokenPath);
    }*/

    @Bean
    public <CustomAuthorizationFilter> SecurityFilterChain getSecurityFilterChain(HttpSecurity http, CustomAuthorizationFilter customAuthorizationFilter,
                                                                                  @Value("${api.basePath}") String basePath) throws Exception {
        http.csrf().disable();
        http.formLogin().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers(basePath + "/users/**").hasAnyAuthority("ROLE_USER");
        http.authorizeRequests().antMatchers(basePath + "/products/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().antMatchers("/v3/api-docs").permitAll();
        http.authorizeRequests().anyRequest().permitAll();
        http.addFilterBefore((Filter) customAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}