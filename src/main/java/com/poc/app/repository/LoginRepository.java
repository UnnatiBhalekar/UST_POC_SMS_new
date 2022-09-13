package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

	Login findByUsername(String username);

}
