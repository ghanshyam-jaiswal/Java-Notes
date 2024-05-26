package com.java;

import java.security.Timestamp;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "person")
	private List<Practice> practice;
	
	public Person() {

	}
	public Person(int id, String name, List<Practice> practice) {
		super();
		this.id = id;
		this.name = name;
		this.practice = practice;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Practice> getPractice() {
		return practice;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPractice(List<Practice> practice) {
		this.practice = practice;
	}
	
	
	
	
	
}
