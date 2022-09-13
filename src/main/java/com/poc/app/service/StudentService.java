package com.poc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.app.entities.Student;
import com.poc.app.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> saveStudent(List<Student> student) {
		return studentRepository.saveAll(student);
	}

	public List<Student> displayStudent() {
		List<Student> student = studentRepository.findAll();
		return student;
	}

}
