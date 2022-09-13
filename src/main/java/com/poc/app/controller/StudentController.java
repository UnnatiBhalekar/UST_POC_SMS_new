package com.poc.app.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.app.entities.Standard;
import com.poc.app.entities.Student;
import com.poc.app.service.StandardService;
import com.poc.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(path = "/save")
	public List<Student> saveStudent(@RequestBody List<Student> student) {
		System.out.println(student);
		return studentService.saveStudent(student);
	
	}
	
	@GetMapping(path="/display")
	public List<Student> displayStudent(){
		return studentService.displayStudent();
	}

}
