package com.dio.proj.livros.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(authz -> authz.requestMatchers("/*").permitAll()).formLogin(login -> login.loginPage("/login")).httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
