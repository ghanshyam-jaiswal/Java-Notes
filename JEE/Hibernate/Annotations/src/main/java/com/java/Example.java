package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shyam")
public class Example {
	@Id
	@Column(name="nothing",unique=true,nullable=false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	
}
