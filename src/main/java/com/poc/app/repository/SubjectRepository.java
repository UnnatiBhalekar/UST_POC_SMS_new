package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
