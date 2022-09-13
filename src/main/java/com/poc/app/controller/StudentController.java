package com.poc.app.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.app.entities.Standard;
import com.poc.app.entities.Student;
import com.poc.app.service.StandardService;
import com.poc.app.service.StudentService;

@RestController
//@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(path = "/admin/student/save")
	public List<Student> saveStudent(@RequestBody List<Student> student) {
		System.out.println(student);
		return studentService.saveStudent(student);
	
	}
	
	@GetMapping(path="/user/student/display")
	public List<Student> displayStudent(){
		return studentService.displayStudent();
	}
	
	@GetMapping(path="/admin/student/display")
	public List<Student> displayStudent1(){
		return studentService.displayStudent1();
	}
	
	@GetMapping("/user/student/search/id/{id}")
	public Student searchStudentById(@PathVariable int id) {
		return studentService.searchStudentById(id);
	}
	
	@GetMapping("/admin/student/search/id/{id}")
	public Student searchStudentById1(@PathVariable int id) {
		return studentService.searchStudentById1(id);
	}
	
	@DeleteMapping("/admin/delete/id/{id}")
	public void DeleteStudentById(@PathVariable int id) {
		studentService.DeleteStudentById(id);
	}
	
	@PutMapping(path = "/admin/update")
    public Object updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

}
