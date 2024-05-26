package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.entity.Student;

@Component
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	public Student saveStudent(Student student) {
		try {
			return dao.saveStudent(student);
		}
		catch (Exception e) {
			return null;
		}
	}
}
