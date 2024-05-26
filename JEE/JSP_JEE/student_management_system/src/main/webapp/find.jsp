<%@page import="com.java.StudentNotFoundException"%>
<%@page import="com.java.StudentDaoImp"%>
<%@page import="com.java.StudentDao"%>
<%@page import="com.java.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form>
		Enter Id:
		<input type="text" name="id" />
		<input type="submit" name="Submit" />
	</form>
	
	<%
	String id=request.getParameter("id");
	if(id!=null){
		
		StudentDao dao=new StudentDaoImp();
		Student student=dao.findStudentById(Integer.parseInt(id));
		if(student!=null){
	%>	
		
		<h1><%= student.getRoll()%></h1>
		<h1><%= student.getName() %></h1>
		<h1><%= student.getEmail() %></h1>
		<h1><%= student.getPsw() %></h1>
		<h1><%= student.getPhone() %></h1>
		<h1><%= student.getAddress() %></h1>
		<h1><%= student.getAge() %></h1>
		<a href="update.jsp?id=<%=student.getRoll()%>">update</a>
		<a>Delete</a>
		
	<%
		}
		else{
				try{
					throw new StudentNotFoundException("student with "+id+" id not found");
				}
				catch(StudentNotFoundException e){
				%>
				<h1 style="color:red"><%=e.getMessage() %></h1>
				<% 
				}
			
		}
	}
	
	%>
	
	
</body>
</html>