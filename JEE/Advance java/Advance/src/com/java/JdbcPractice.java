package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*;

public class JdbcPractice {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/Test";
			String uname="postgres";
			String psw="root";
			
			Connection connection=DriverManager.getConnection(url,uname,psw);
//			System.out.println(connection);
			Statement statement=connection.createStatement();
			String query="create table HP (laptop_name varchar(20),model varchar(10));";
			statement.execute(query);
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
}


