


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
<h5>User Name="Admin" and Password="root"</h5>
</FONT>
<form:form action="loginform.html" commandName="loginForm">
<table>
<tr>
<td>User Name:<FONT color="red"><form:errors
path="userName" /></FONT></td>
</tr>
<tr>
<td><form:input path="userName" /></td>
</tr>
<tr>
<td>Password:<FONT color="red"><form:errors
path="password" /></FONT></td>
</tr>
<tr>
<td><form:password path="password" /></td>
</tr>
<tr>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>