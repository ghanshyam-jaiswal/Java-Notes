package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/find")
public class FindControl extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Car c=new Car();
		c.setId(Integer.parseInt(req.getParameter("id")));
		
		CarDaoImplementation cdi=new CarDaoImplementation();
		cdi.findCar(c);
		
		PrintWriter pw= resp.getWriter();
		pw.write("<html><body><h1>Details :</h1><h2>");
		pw.write(c.getId()+"<br>"+c.getName()+"<br>"+c.getModel()+"<br>"+c.getColor()+"<br>"+c.getPrice()+"<br>"+c.getOwner());
		pw.write("</h2></body></html>");
	}

}
