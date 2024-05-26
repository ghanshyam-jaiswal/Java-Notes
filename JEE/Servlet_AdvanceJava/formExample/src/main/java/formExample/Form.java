package formExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="form",urlPatterns="/save") 
// this annotation is a 2nd way instead of servlet name and url pattern.
public class Form extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String email=req.getParameter("email");
//		String password=req.getParameter("password");
//	
//		System.out.println(email);
//		System.out.println(password);
//		
//		PrintWriter pw=resp.getWriter();
//		pw.write("<html><body>");
//		pw.write("<h2>"+email+"</h2>");
//		pw.write("<h2>"+password+"</h2>");
//		pw.write("</html></body>");
//		

		
		
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		PrintWriter pw=resp.getWriter();
		pw.write("successful....");
		
		
		System.out.println(email);
		System.out.println(password);
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","root");
			PreparedStatement ps=connection.prepareStatement("insert into form values(?,?);");
			ps.setString(1, email);
			ps.setString(2, password);
			ps.execute();
			
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
