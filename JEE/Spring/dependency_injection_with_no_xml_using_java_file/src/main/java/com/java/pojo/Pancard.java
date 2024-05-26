package com.java.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component  // If I want it as bean class and if we don't use the @component (instead of using @component) the we have to use @Bean in config class file inside class.
public class Pancard {
    
	@Value(value = "7")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Pancard() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
}
