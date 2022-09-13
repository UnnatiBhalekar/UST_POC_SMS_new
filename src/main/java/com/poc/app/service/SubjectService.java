package com.poc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.app.entities.Student;
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
	
	public Subject searchSubjectById(int subject_id) {
		Subject s = subjectRepository.findById(subject_id).get();
		return s;
		
	}
	
	  public Object updateSubject(Subject subject) {
		  if(subjectRepository.existsById(subject.getSubject_id())) {
			  Subject updatedSubject = subjectRepository.save(subject);
		        return updatedSubject;
		  }
		  else {
			  return "Data Not Found";
		  }
	    }
	
	public void DeleteSubjectById(int subject_id) {
		subjectRepository.deleteById(subject_id);
		
	}

	public List<Subject> displaySubject1() {
		List<Subject> subject = subjectRepository.findAll();
		return subject;
	}
	
	public Subject searchSubjectById1(int subject_id) {
		Subject s = subjectRepository.findById(subject_id).get();
		return s;
		
	}

}
