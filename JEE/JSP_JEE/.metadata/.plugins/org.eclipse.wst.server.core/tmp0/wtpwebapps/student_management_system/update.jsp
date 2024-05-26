<%@page import="com.java.Student"%>
<%@page import="com.java.StudentDaoImp"%>
<%@page import="com.java.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String id=request.getParameter("id");
		
		StudentDao dao=new StudentDaoImp();
		Student student=dao.findStudentById(Integer.parseInt(id));
		
	%>	
		
		
		
	<form action="studentUpdate" method="post">
			<label>Roll:</label>
			<input type="text" name="roll" value="<%=student.getRoll()%>"><br>
			<label>Name:</label>
			<input type="text" name="name" value="<%=student.getName()%>"><br>
			<label>Email:</label>
			<input type="mail" name="email" value="<%=student.getEmail()%>"><br>
			<label>Password:</label>
			<input type="password" name="password" value="<%=student.getPsw()%>"><br>
			<label>Phone:</label>
			<input type="tel" name="phone" value="<%=student.getPhone()%>"><br>
			<label>Address:</label>
			<textarea row="2" cols="20" name="address"><%=student.getAddress()%></textarea><br>
			<label>Age:</label>
			<input type="number" name="age" value="<%=student.getAge()%>"><br>
		
			<input type="submit" value="Submit">
	</form>
	
</body>
</html>