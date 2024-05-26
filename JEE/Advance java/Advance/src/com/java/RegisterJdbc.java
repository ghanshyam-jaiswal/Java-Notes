package com.java;

import java.sql.*;
import org.postgresql.Driver;

public class RegisterJdbc {

	public static void main(String[] args) {
		
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String psw="root";
			Connection connection =DriverManager.getConnection(url,uname,psw);
			System.out.println(connection);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
