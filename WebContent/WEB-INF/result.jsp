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
	Integer result = (Integer) request.getAttribute("result");
		out.print("<b> The Average is: " + result + "</b>");
	%>

</body>
</html>