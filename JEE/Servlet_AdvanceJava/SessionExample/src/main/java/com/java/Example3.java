package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/page_b")
public class Example3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession s=req.getSession();
		String name=(String)s.getAttribute("a");
		String name1=(String)s.getAttribute("b");
		User user=(User)s.getAttribute("user");
		
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body> <p>"+name+" "+name1+" "+user+" "+"</P> </body></html>");
		
		
		
	}

}