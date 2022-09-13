package com.poc.app.controller;

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
import com.poc.app.entities.Subject;
import com.poc.app.service.SubjectService;

@RestController
//@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	@PostMapping("/admin/subject/save")
	public List<Subject> saveSubject(@RequestBody List<Subject> subject) {
		return subjectService.saveSubject(subject);
	
	}
	
	@GetMapping("/user/subject/display")
	public List<Subject> displaySubject(){
		return subjectService.displaySubject();
	}
	
	@GetMapping("/admin/subject/display")
	public List<Subject> displaySubject1(){
		return subjectService.displaySubject1();
	}
	
	@GetMapping("/user/subject/search/id/{id}")
	public Subject searchSubjectById(@PathVariable("id") int id) {
		return subjectService.searchSubjectById(id);
	}
	
	@GetMapping("/admin/subject/search/id/{id}")
	public Subject searchSubjectById1(@PathVariable("id") int id) {
		return subjectService.searchSubjectById1(id);
	}
	
	@DeleteMapping("/admin/subject/delete/id/{id}")
	public void DeleteSubjectById(@PathVariable int id) {
		subjectService.DeleteSubjectById(id);
	}
	
	@PutMapping(path = "/admin/subject/update")
    public Object update(@RequestBody Subject subject) {
        return subjectService.updateSubject(subject);
    }

}
