//package com.company.springrest.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("Parvin")
//                .password("12345")
//                .roles("USER")
//                .and()
//                .withUser("Anar")
//                .password("1234")
//                .roles("ADMIN");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/welcome","/")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and().httpBasic();
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
