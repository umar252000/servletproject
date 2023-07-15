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
  // Retrieve form data
  try{
  String name = request.getParameter("name");
  String email = request.getParameter("email");

  // Connect to the database
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "umar25");
  
  // Execute the insert query
  PreparedStatement pstmt = conn.prepareStatement("INSERT INTO user (name, email) VALUES (?, ?)");
  pstmt.setString(1, name);
  pstmt.setString(2, email);
   pstmt.executeUpdate();
  out.println("successfull");
   pstmt.close();
  conn.close();

}
catch(Exception e){

	e.getStackTrace();
 
 
}
%>

</body>
</html>