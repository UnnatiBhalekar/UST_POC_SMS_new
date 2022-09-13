package com.poc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.app.entities.Subject;
import com.poc.app.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	@PostMapping("/save")
	public List<Subject> saveSubject(@RequestBody List<Subject> subject) {
		return subjectService.saveSubject(subject);
	
	}
	
	@GetMapping("/display")
	public List<Subject> displaySubject(){
		return subjectService.displaySubject();
	}

}
