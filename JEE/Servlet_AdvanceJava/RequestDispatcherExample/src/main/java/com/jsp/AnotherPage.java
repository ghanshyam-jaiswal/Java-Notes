package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class AnotherPage extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("2nd");
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body><h1>This is java Another Class</h1></html></body>");
	}

	
	
	
	
}
