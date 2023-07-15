<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>first jsp</title>
</head>
<body>
<h2>first jsp</h2>
<%!
int a=13;
int b=14;
int m1()
{
	return a+b;
}
%>
<%

out.println(m1());
%>
<%= m1() %>o
<%@include file="second.jsp" %>>





</body>
</html>