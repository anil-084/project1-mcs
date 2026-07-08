/*
package com.testing.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config`2.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        httpSecurity.csrf(crsf->crsf.disable())
                .authorizeHttpRequests(
                        auth->auth.requestMatchers("/api").permitAll()
                                .anyRequest().authenticated()).httpBasic(Customizer.withDefaults());



        return httpSecurity.build();
    }
}
*/
