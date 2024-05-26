package com.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/example")
public class Form extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String rollno=req.getParameter("rollno");
		String age=req.getParameter("age");
		
		Student student=new Student();
		
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setRoll(Integer.parseInt(rollno));
		student.setAge(Integer.parseInt(age));
		
		new InsertData().insert(student);
		
	}

}
