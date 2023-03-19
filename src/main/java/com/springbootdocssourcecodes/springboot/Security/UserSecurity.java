package com.springbootdocssourcecodes.springboot.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
public class UserSecurity {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        //define query to retrieve user
        jdbcUserDetailsManager.setUsersByUsernameQuery("select user_id, pw, active from members where user_id = ?");
        //define query to retrieve authorities
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select user_id, role from roles where user_id = ?");
        return jdbcUserDetailsManager;
    }
    /*
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails user = User.builder()
                .username("user")
                .password("{noop}password")
                .roles("EMPLOYEE")
                .build();
        UserDetails manager = User.builder()
                .username("admin")
                .password("{noop}password")
                .roles("MANAGER,EMPLOYEE")
                .build();
        UserDetails admin = User.builder()
                .username("manager")
                .password("{noop}password")
                .roles("ADMIN,EMPLOYEE","MANAGER")
                .build();
        return new InMemoryUserDetailsManager(user, manager, admin);
    }
    */

    //In spring 6.0 use requestMatchers instead of antMatchers
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer.antMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                        .antMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                        .antMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .antMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                        .antMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN"));
        // use HTTP Basic authentication
        http.httpBasic();
        // disable CSRF
        http.csrf().disable();
        return http.build();
    }
}
