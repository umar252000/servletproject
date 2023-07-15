<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "umar25");

  // Execute the select query
  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery("SELECT * FROM user where name='umar'");

  // Process the results
  while (rs.next()) {
    String name = rs.getString(1);
    String email = rs.getString("email");
    // Output the data or perform any other processing
 	  out.println("<h2>"+"Name: " + name + ", Email: " + email+"</h2>");
    
    
    
  	//out.println(name);
  //	out.println(email);
  }

  // Close the database connection
  rs.close();
  stmt.close();
  conn.close();
}
catch(Exception exception)
{
	exception.getStackTrace();
}
%>

</body>
</html>