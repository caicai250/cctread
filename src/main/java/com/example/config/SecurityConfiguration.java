package com.example.config;

import com.example.config.security.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    AuthUserService authUserService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserService).passwordEncoder(new BCryptPasswordEncoder());
//        auth
//                .inMemoryAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder()).withUser("jingyuandi")
//                .password(new BCryptPasswordEncoder().encode("jingyuandi")).roles("ADMIN")
//                .and()
//                .passwordEncoder(new BCryptPasswordEncoder()).withUser("test")
//                .password(new BCryptPasswordEncoder().encode("test")).roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().csrfTokenRepository(new CookieCsrfTokenRepository()).requireCsrfProtectionMatcher(
//                httpServletRequest -> httpServletRequest.getMethod().equals("POST")
//        );
        http.csrf().disable();
        http.authorizeRequests()
                // 所有用户均可访问的资源
                .antMatchers("/css/**", "/js/**","/image/**", "/webjars/**").permitAll()
                .antMatchers("/signIn","/signInUser").permitAll()
                .antMatchers("/main").permitAll()
                .anyRequest().fullyAuthenticated()//authenticated()
                .and().formLogin().loginPage("/login").usernameParameter("username").passwordParameter("password")
                .failureUrl("/login?error=true").successForwardUrl("/main").permitAll()
                .and().logout().logoutUrl("/logout").permitAll();
    }

}
