package com.poc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.app.entities.Subject;
import com.poc.app.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	SubjectRepository subjectRepository;
	
	
	public List<Subject> saveSubject(List<Subject> subject) {
		return subjectRepository.saveAll(subject);
		
	}
	
	public List<Subject> displaySubject(){
		List<Subject> subject = subjectRepository.findAll();
		return subject;
	}

}
