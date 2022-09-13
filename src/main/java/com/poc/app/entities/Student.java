package com.poc.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	
	private String student_name;
	
	@JsonIgnore
	@ManyToOne
	private Standard standard;


	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", standard=" + standard + "]";
	}


	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public Standard getStandard() {
		return standard;
	}


	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	
	
	
	
	

}
