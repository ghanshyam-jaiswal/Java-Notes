package com.java;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","root");
			
			int num;
			do {
				
				System.out.println("select options:\n1. Enter Details\n2. Update User Name\n3. Display UserName\n4. Display All Users\n5. Display User Age Less than 30");
				int option=sc.nextInt();
				
				switch(option) {
				case 1:{
					System.out.println("Enter id:");
					int id=sc.nextInt();
					System.out.println("Enter name:");
					String name=sc.next();
					System.out.println("Enter age:");
					int age=sc.nextInt();
					System.out.println("Enter email:");
					String email=sc.next();
					System.out.println("Enter phone:");
					long phone=sc.nextLong();
					System.out.println("Enter password:");
					String password=sc.next();
					
					PreparedStatement ps=connection.prepareStatement("insert into users values(?,?,?,?,?,?);");
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, age);
					ps.setString(4, email);
					ps.setLong(5, phone);
					ps.setString(6, password);
					
					int done=ps.executeUpdate();
					if(done>0) {
						
						System.out.println("inserted successfull...");
					}
					break;
					
				}
				case 2:{
					
					System.out.println("Enter User id:");
					String id=sc.next();
					System.out.println("Enter User Name:");
					String name=sc.next();
					
					Statement statement=connection.createStatement();
					statement.execute("update users set name='"+name+"' where id="+id+";");
					
					System.out.println("successful...");
					
					break;
					
				}
				case 3:{
					
					System.out.println("Enter User id:");
					String id=sc.next();
					Statement statement=connection.createStatement();
					statement.execute("select name from users where id="+id+";");
					
					ResultSet rs=statement.getResultSet();
					while(rs.next()) {
						System.out.println(rs.getString("name"));;
					}
					break;
					
				}
				case 4:{
					Statement statement=connection.createStatement();
					statement.execute("select name from users;");
					ResultSet rs=statement.getResultSet();
					while(rs.next()) {
						System.out.println(rs.getString("name"));;
					}
					break;
					
				}
				case 5:{
					
					Statement statement=connection.createStatement();
					statement.execute("select age from users where age<30;");
					ResultSet rs=statement.getResultSet();
					while(rs.next()) {
						System.out.println(rs.getString("age"));;
					}
					break;
					
				}
				default:{
					System.out.println("invailid...");
				}
				
				
				
			}
				
				
				
				System.out.println("Enter\n1. Continue\n2. Exit");
				num=sc.nextInt();
				
			}while(num==1);
			
			System.out.println("Thank You....");
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
		
		
		
		
		
		
		
		
		
	}
}
