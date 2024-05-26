package com.java;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step4Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String pass="root";
			
			Connection connection=DriverManager.getConnection(url,uname,pass);
			Statement statement=connection.createStatement();
			statement.execute("insert into student values(4,'gk','gk@gmail.com',7000365544,02);");
			
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
