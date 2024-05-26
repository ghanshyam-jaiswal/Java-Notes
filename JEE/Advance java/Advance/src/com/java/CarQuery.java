package com.java;

import java.sql.*;

public class CarQuery {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/car";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			Statement statement=connection.createStatement();
			String query="insert into car values (2010,'bmw',5000,1);";
			statement.execute(query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
