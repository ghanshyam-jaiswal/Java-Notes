package com.java;

import java.sql.*;

public class FirstJdbc {

	public static void main(String[] args) {
		try {
			
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			//System.out.println(connection);
//			String query1="create table Ok(id integer primary key,name varchar(30) not null,"
//					+ "course varchar(20),experience varchar(20));";
//			String query2="insert into Ok values(50,'shyam','Btech','Fresher');";
			String query2="update Ok set id=1,name='jaiswal',course='psc',experience=5;";
			Statement statement=connection.createStatement();
//			statement.execute(query1);
			statement.execute(query2);
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
