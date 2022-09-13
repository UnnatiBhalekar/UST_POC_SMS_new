package com.poc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.app.entities.Standard;
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
	
	public Student searchStudentById(int student_id) {
		Student s = studentRepository.findById(student_id).get();
		return s;
		
	}
	
	  public Object updateStudent(Student student) {
		  if(studentRepository.existsById(student.getStudent_id())) {
			  Student updatedStudent = studentRepository.save(student);
		        return updatedStudent;
		  }
		  else {
			  return "Data Not Found";
		  }
	    }
	
	public void DeleteStudentById(int student_id) {
		studentRepository.deleteById(student_id);
		
	}

	public List<Student> displayStudent1() {
		List<Student> student = studentRepository.findAll();
		return student;
	}

	public Student searchStudentById1(int student_id) {
		Student s = studentRepository.findById(student_id).get();
		return s;
	}
}
