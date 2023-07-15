l<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
try{
	
	String name=request.getParameter("name");

//	String email=request.getParameter("email");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "umar25");
	 PreparedStatement pstmt = conn.prepareStatement("delete from user where name=?");
	pstmt.setString(1,name);
	pstmt.executeUpdate();
	out.println("sucessfull");
  	pstmt.close();
	conn.close();
  	
}
catch(Exception exception)
{
	exception.getStackTrace();
}
%>


</body>
</html>