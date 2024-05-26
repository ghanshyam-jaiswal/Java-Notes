package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteControl extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Car c=new Car();
		
		c.setId(Integer.parseInt(req.getParameter("id")));
		
		CarDaoImplementation carDao=new CarDaoImplementation();
		carDao.CarDelete(c);
		
		PrintWriter pw= resp.getWriter();
		pw.write("<html><body><h1>Successful</h1></body></html>");
		
	}

}
