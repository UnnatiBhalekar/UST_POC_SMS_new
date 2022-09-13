package com.poc.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.poc.app.entities.Login;
import com.poc.app.repository.LoginRepository;


@Component
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	LoginRepository loginRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		//UserDetails user1 = User.withUsername(username).password("{noop}test").roles("ADMIN").build();
		//UserDetails user1= User.withDefaultPasswordEncoder().username(username).password("test").roles("ADMIN").build();
		Login login=loginRepository.findByUsername(username);
		if(login==null) {
			UsernameNotFoundException exception=new UsernameNotFoundException("User not found:"+username);
			throw exception;
		}
		
		
		UserDetails user1 = User.withDefaultPasswordEncoder().username(login.getUsername()).password(login.getPassword()).roles(login.getRole()).build();
		
		return user1;
	}

}