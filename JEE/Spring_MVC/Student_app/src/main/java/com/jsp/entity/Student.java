package com.jsp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Component

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	@OneToMany
	private List<Subject>subjects;
	
	
	/*
	 * Project Lombok (Tool and Dependency we have to download) :
	 * Tool : https://projectlombok.org/download (it is jar file we need to install it after download)
	 * Dependency : Project Lombok
	Lombok is a Java library that provides annotations to simplify Java 
	development by automating the generation of boilerplate code. Key features
	include automatic generation of getters, setters, equals, hashCode, and 
	toString methods, as well as a facility for automatic resource management.
	 It aims to reduce the amount of manual coding, thereby streamlining 
	 the codebase and reducing potential for errors.
	*/
	
	
}
