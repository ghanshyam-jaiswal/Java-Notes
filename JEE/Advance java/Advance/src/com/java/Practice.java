package com.java;
import java.util.*;
import java.sql.SQLException;
import java.sql.*;

import org.postgresql.Driver;
public class Practice {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			try {
					int again;
					do {
					
						Class.forName("org.postgresql.Driver");
						Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student?user=postgres&password=root");
						PreparedStatement ps=connection.prepareStatement("insert into form values(?,?);");
						System.out.println("select \n1. Login\n2. SignUp\n3. LogOut");
						int select=sc.nextInt();
						switch(select) {
						case 1:{
							
							int num;
							
								System.out.print("Enter email: ");
								String email=sc.next();
								ps.setString(1,email);
								System.out.print("Enter psw: ");
								String psw=sc.next();
								ps.setString(2,psw);
								
								ps.execute();
							
							System.out.println("successful Thank You........");
							break;
						}
						case 2:{
							
							System.out.println("Do you want to Signup\n1. Signup\n2. exit");
							int signup=sc.nextInt();
							if(signup==1) {
								System.out.print("Enter your password: ");
								String psw=sc.next();
								
								Statement statement=connection.createStatement();
								boolean b=statement.execute("select* from form where password='"+psw+"';");
								ResultSet rs=statement.getResultSet();
								while(rs.next()) {
									System.out.print("email: "+rs.getString(1)+" ");
									System.out.print("psw: "+rs.getString(2)+" ");
									System.out.println();
									
								}
								System.out.println("signup successful...");
							}
							else {
								System.out.println("try again");
							}
							break;
						}
						case 3:{
							Statement statement=connection.createStatement();
							System.out.println("Enter your psw: ");
							String psw=sc.next();
							statement.execute("delete from form where password='"+psw+"';");
							System.out.println("logout successful");
							break;
						}
						default:{
							System.out.println("Try Again..");
						}
						
						}
						
						
						
						connection.close();
					
					
					
					
						System.out.println("Do you want\n1. continue\n2. exit");
						again=sc.nextInt();
					}
				while(again==1);
				System.out.println("Thank You");
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		
		
		
		
		
		
	}
}

