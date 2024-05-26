package com.java;

import java.sql.*;

public class CarNumber {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/car";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			Statement statement=connection.createStatement();
			String query="create table carnumber (cid integer,cmodel02 integer,cname02 varchar(20),cprice02 integer,foreign key(cid) references car);";
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
