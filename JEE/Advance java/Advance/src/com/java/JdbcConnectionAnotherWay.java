package com.java;

import java.sql.*;

public class JdbcConnectionAnotherWay {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
//			String url="jdbc:postgresql://localhost:5432/student?user=postgres&password=root"
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student?user=postgres&password=root");
			Statement statement=connection.createStatement();
			String query="";
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
