<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Yahoo!!!!!!!! from JSP</title>
	</head>
	<body>
		Hello from JSP. 
		<%
			Date today = new Date();
		%>
		<div>Today = <%= today %></div>
	</body>
</html> 