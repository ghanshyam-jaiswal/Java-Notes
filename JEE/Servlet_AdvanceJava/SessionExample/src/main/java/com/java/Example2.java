package com.java;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/page_a")
public class Example2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		User user =new User(1,"abc","1234");
		HttpSession s=req.getSession();
		s.setAttribute("a", name);
		s.setAttribute("b", password);
		s.setAttribute("user", user);
		
	
	}

}
