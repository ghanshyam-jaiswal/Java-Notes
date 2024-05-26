package com.java;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			Statement statement=connection.createStatement();
			String query="create table Test(id integer primary key,name varchar(20),"
					+ "email varchar(20),phone bigint,qualification varchar(20),"
					+ "age integer,experience varchar(20));";
			statement.execute(query);
			connection.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
