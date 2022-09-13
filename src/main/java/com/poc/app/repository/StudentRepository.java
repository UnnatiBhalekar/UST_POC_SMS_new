package com.poc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.app.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
