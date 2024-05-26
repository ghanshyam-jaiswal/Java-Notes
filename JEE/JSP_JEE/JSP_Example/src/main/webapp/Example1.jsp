<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>jsp</h1>
	<%! int a=10; %>
	<h2><%=a %></h2>
	
	<%
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	%>
	
	<h2><%=a %></h2>
	
	<form action="">
		<label>Name:</label>
		<input type="text" name="name">
		<label>Pass:</label>
		<input type="password" name="pass">
		<input type="submit" value="submit">
	</form>

	<%
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	%>
	<h1>Name:<%=name%></h1>
	<h1>Pass:<%=pass%></h1>
	
	
</body>
</html>