package com.java;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Student student=new Student();
		student.setRoll(Integer.parseInt(req.getParameter("roll")));
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPsw(req.getParameter("password"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));
		student.setAddress(req.getParameter("address"));
		student.setAge(Integer.parseInt(req.getParameter("age")));
	
		String message=null;
		
		boolean saveStudent=false;
		
		StudentDao dao=new StudentDaoImp();
		
		dao.saveStudent(student);
		
		if(saveStudent) {
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("message", message);
			req.getRequestDispatcher("form.jsp").forward(req, resp);
		}
	
	}

}
