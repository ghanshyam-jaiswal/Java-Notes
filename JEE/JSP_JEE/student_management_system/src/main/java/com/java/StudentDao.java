package com.java;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

		boolean saveStudent(Student student);
		boolean updateStudent(Student student) throws SQLException;
		boolean deleteStudent(Student student);
		Student findStudentById(int id);
		List<Student>findAllStudent();
		
}
