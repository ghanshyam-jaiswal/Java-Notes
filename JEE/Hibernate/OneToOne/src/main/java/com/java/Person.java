package com.java;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@OneToOne
	private PanCard p;
	
	
	public Person(int id, String name, PanCard p) {
		this.id = id;
		this.name = name;
		this.p = p;
	}

	public PanCard getP() {
		return p;
	}

	public void setP(PanCard p) {
		this.p = p;
	}

	public Person() {

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
	
	
}
