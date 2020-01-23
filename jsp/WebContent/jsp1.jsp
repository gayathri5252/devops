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
//String s=pageContext.setAttribute("login",pageContext.SESSION_SCOPE);
out.println("Welcome"+pageContext.getAttribute("login")+"for this site");%>
</body>
</html>