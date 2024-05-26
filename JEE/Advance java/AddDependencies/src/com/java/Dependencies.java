package com.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dependencies {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student?user=postgres&password=root");
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
