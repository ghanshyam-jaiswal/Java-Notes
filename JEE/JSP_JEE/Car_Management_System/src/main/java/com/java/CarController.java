package com.java;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/car")
public class CarController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String model=req.getParameter("model");
		String color=req.getParameter("color");
		String price=req.getParameter("price");
		String owner=req.getParameter("owner");
		
		Car c=new Car();
		
		c.setId(Integer.parseInt(id));
		c.setName(name);
		c.setModel(model);
		c.setColor(color);
		c.setPrice(Double.parseDouble(price));
		c.setOwner(owner);
		
		CarDaoImplementation carDao=new CarDaoImplementation();
		carDao.saveCar(c);
		
	}

}
