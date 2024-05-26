package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private int id;
	private String panNo;
	@OneToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public PanCard(int id, String panNo, Person person) {
		this.id = id;
		this.panNo = panNo;
		this.person = person;
	}
	public PanCard() {
		
	}
	public PanCard(int id, String panNo) {
		this.id = id;
		this.panNo = panNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
}
