package com.java;

public class Parent {
	
	private int id;
	private String name;
	
	Parent(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		System.out.println(id);
	}
	public String getName() {
		return name;
	}
	public void setName(int id,String name) {
		if(this.id==id) {
			this.name=name;
			System.out.println(name);
		}
		else {
			System.out.println("wrong id");
		}
		
	}
}
