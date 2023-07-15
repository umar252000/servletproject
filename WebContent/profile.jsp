<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
</head>
<body>

<%
String myname=(String) session.getAttribute("name1");
%>
<h2>name=</h2>
<%= myname %>

<a href="secondsession.jsp">secondsession </a>
<a href="Logout">logout	 </a>
</body>
</html>