package com.jsp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class Example extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			
			System.out.println(name);
			System.out.println(pass);
			
		RequestDispatcher rd=req.getRequestDispatcher("Another.html");
		rd.include(req, resp);
	
	}

	
	
	
}
