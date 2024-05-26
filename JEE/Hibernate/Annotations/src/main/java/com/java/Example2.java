package com.java;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Example2 {

	@Id
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	// GenerationType.IDENTITY/SEQUENCE/AUTO/TABLE--IDENTITY&SEQUENCE are mostly used.
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_gen")
	@SequenceGenerator(name="id_gen",allocationSize = 20,initialValue = 10)
	
//	@GeneratedValue(strategy = GenerationType.Auto) 
	
	
	
	private int id;
	private String name;
	
	@CreationTimestamp
	private Time time;
	
	@UpdateTimestamp
	private Time updateTime;

	public Example2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example2(int id, String name, Time time, Time updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.updateTime = updateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Time getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Time updateTime) {
		this.updateTime = updateTime;
	}
	
}
