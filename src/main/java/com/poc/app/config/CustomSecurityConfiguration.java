package com.poc.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.poc.app.config.CustomUserDetailsService;



@Configuration
@EnableWebSecurity
public class CustomSecurityConfiguration extends WebMvcConfigurerAdapter{
	
	private void configure(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests().antMatchers("/admin/*").hasRole("admin")//http://localhost:8080/admin/"
		.antMatchers("/user/*").hasRole("user")//.and().httpBasic();
		.antMatchers("/*").authenticated().and().formLogin();
		
	}
	
	@Autowired
	CustomUserDetailsService userDetailsService;
	
//data base example
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
	}

}
