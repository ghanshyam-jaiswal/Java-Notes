package com.java;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ProperyLoadingProcessJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student";
			Properties p=new Properties();
			File f=new File("a.properties");
			FileInputStream fis=new FileInputStream(f);
			p.load(fis);
			
			Connection connection=DriverManager.getConnection(url, p);
			System.out.println(connection);
			String query="create table Properties(username varchar(20),password interger(10));";
//			Statement statement=connection.createStatement();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}