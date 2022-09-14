package com.poc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.app.repository.LoginRepository;
import com.poc.app.entities.Login;

@SpringBootApplication
public class UstPocSms1Application implements CommandLineRunner{
	
	@Autowired
	LoginRepository loginRepository;

	public static void main(String[] args) {
		SpringApplication.run(UstPocSms1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.setUsername("kumar");
		login.setPassword("kumar");
		login.setRole("admin");
		
		Login login1 = new Login();
		login1.setUsername("test");
		login1.setPassword("test");
		login1.setRole("user");
		
		loginRepository.save(login);
		loginRepository.save(login1);
		
		
		System.out.println("CommandLine Runner run method");
	}

}
