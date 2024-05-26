package com.java;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int rollno;
	private String name;
	private String course;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return rollno+" "+name+" "+course;
	}
	public Student(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+" "+name+" "+course;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
