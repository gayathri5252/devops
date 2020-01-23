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
String login,pass;
login=request.getParameter("id");
pass=request.getParameter("psw");
//out.println("login: "+login+" password: "+pass);
if(login.equals("gayi")&& pass.equals("1234"))
{out.println(config.getInitParameter("id"));
 //session.setAttribute("login",login);
 
}
else
{
	response.sendRedirect("home.html");
}
%>
</body>
</html>