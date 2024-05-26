package com.java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")	// to avoid the singleton class this annotation is used then we will get differen different reference.
@PropertySource(value = "classpath:data.properties")
public class Person {

//	@Value(value = "shyam")
	@Value(value = "${name}") // priority will be 1.constructor, 2.setter, 3.data member to inject value by @Value. It will overwrite the value we use all way.
	private String name;
//	@Value(value = "7000365544")
	@Value(value = "${phone}")
	private long phone;
//	@Value(value = "23")
	@Value(value = "${age}")
	private int age;
	
	@Autowired
	private Pancard pancard;
	
	public Pancard getPancard() {
		return pancard;
	}
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, long phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
}
