package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStateJdbc {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String password="root";
			Connection connection=DriverManager.getConnection(url,uname,password);
//			System.out.println(connection);
			PreparedStatement ps=connection.prepareStatement("insert into student values(?,?,?,?,?);");
			ps.setInt(4,05);
			ps.setString(5,"gk");
			ps.setString(6,"gk@gmail.com");
			ps.setLong(7,9173656485L);
			ps.setInt(8,10);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
