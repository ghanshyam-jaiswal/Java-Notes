package com.java;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/session")
public class SessionExample extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		System.out.println(name);
		System.out.println(pass);
		
		Cookie cookie=new Cookie("name", name);
		Cookie cookie2=new Cookie("pass", pass);
		System.out.println(cookie);
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		RequestDispatcher rd=req.getRequestDispatcher("/page2");
		rd.forward(req, resp);
		
		
		
		
	}
	
	
}
