package com.poc.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.entities.Standard;

public interface StandardRepository extends JpaRepository<Standard, Integer>{



}
