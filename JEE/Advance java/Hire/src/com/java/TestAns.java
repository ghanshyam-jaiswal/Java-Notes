package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class TestAns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			String uname="postgres";
			String psw="root";
			Connection connection=DriverManager.getConnection(url,uname,psw);
			Statement statement=connection.createStatement();
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter phone");
			long phone=sc.nextLong();
			System.out.println("Enter qualification");
			String qualification=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("Enter experience >2 ");
			int experience=sc.nextInt();
					
			String query="insert into Test values("+id+",'"+name+"','"
					+email+"',"+phone+",'"+qualification+"',"
					+age+",'"+experience+"');";
			if(experience>2) {
				
				statement.execute(query);
				connection.close();
				System.out.println("Successful");
			}
			else {
				System.out.println("Enter experience >2");
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