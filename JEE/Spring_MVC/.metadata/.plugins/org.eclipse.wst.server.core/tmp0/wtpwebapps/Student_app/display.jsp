<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="s" items="${students}">
		<h1>${s.name}</h1>
		<h1>${s.email}</h1>
	</c:forEach>
	
	<c:if test="${10==10}">
		<h1>hello spring if condition</h1>
	</c:if>

</body>
</html>