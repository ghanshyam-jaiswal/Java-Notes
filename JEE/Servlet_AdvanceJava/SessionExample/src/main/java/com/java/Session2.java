package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class Session2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1=null;
		String s2=null;
		Cookie[] cookies=req.getCookies();
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName());
			s1=cookie.getValue();
			System.out.println(s1);
		}
		
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body> <p>"+s1+"</P> </body></html>");
		
	}

	
	
	
	
	
}