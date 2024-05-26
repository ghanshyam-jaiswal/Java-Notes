package com.jsp.jsonexample2.entity;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Student {


	private int id;
	private String name;
	private List<Integer> list;
	private Map map;
	private Subject subject;
	
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + ", map=" + map + ", subject=" + subject
				+ "]";
	}

	public int getId() {
		return id;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
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
