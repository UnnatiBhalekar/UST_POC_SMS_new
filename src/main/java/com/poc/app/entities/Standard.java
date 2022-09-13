package com.poc.app.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Standard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int standard_id;
	
	private String teacher;
	
	
	@OneToMany(mappedBy = "standard")
	private List<Student> students;
	
	@OneToMany(mappedBy = "standard")
	private List<Subject> subjects;

	@Override
	public String toString() {
		return "Standard [standard_id=" + standard_id + ", teacher=" + teacher + ", students=" + students
				+ ", subjects=" + subjects + "]";
	}

	public int getStandard_id() {
		return standard_id;
	}

	public void setStandard_id(int standard_id) {
		this.standard_id = standard_id;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
