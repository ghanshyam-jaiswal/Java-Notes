package com.java;

import java.sql.*;
public class ResulSetJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			Statement statement=connection.createStatement();
			String query="select* from student;";
			statement.execute(query);
			ResultSet resultset=statement.getResultSet();
			
			while(resultset.next()) {
				
				System.out.print(resultset.getInt("id"));
				System.out.print(resultset.getString("name"));
				System.out.print(resultset.getString("email"));
				System.out.print(resultset.getLong("phon_no"));
				System.out.print(resultset.getInt("psw"));
				System.out.println();
			}
				
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}