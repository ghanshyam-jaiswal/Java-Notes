package com.bank;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class SignUp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String dob=req.getParameter("dob");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String drno=req.getParameter("drno");
		String street=req.getParameter("street");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String pincode=req.getParameter("pincode");
		String role=req.getParameter("role");
		
		User user =new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhone(Long.parseLong(phone));
		user.setDOB(LocalDate.parse(dob));
		user.setPassword(password);
		new UserDao().saveUser(user);
		
		
		
	}
	
}
