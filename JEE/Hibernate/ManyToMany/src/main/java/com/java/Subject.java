package com.java;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String sub_name;
	@ManyToMany
	List<Student>student;
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Subject(int id, String sub_name, List<Student> student) {
		super();
		this.id = id;
		this.sub_name = sub_name;
		this.student = student;
	}
	public Subject() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public Subject(int id, String sub_name) {
		super();
		this.id = id;
		this.sub_name = sub_name;
	}
	
	
}
