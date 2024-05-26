package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public void insert(Student student) {
		
//		Student student=new Student();
		Connection connection=Databse.connectDB();
		try {
			PreparedStatement ps=connection.prepareStatement("insert into example values(?,?,?,?);");
			ps.setInt(1,student.getId());
			ps.setString(2,student.getName());
			ps.setInt(3,student.getRoll());
			ps.setInt(4,student.getAge());
			
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
