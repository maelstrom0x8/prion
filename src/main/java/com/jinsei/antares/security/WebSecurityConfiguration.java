package com.jinsei.antares.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.formLogin(c -> {
            c.defaultSuccessUrl("/home");
            c.usernameParameter("username");
            c.passwordParameter("password");
        });

        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        return http.build();
    }

}
