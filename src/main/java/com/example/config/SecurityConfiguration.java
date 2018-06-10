package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder()).withUser("jingyuandi")
                .password(new BCryptPasswordEncoder().encode("jingyuandi")).roles("ADMIN")
                .and()
                .passwordEncoder(new BCryptPasswordEncoder()).withUser("test")
                .password(new BCryptPasswordEncoder().encode("test")).roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
           super.configure(http);
        }

}
