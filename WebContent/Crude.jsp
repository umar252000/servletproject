<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
Connection con;
PreparedStatement ps;
public void jspint(){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","umar25");
		ps=con.prepareStatement("insert into off1 values(?,?,?)");
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	public void jspDestroy(){
	
		try{
		con.close();
		ps.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	

%>
<% 
String str=request.getParameter("id");
int no=Integer.parseInt(str);
String name=request.getParameter("name");
int sal=Integer.parseInt(request.getParameter("salary"));
ps.setInt(1,no);
ps.setString(2,name);
ps.setInt(3,sal);
ps.executeUpdate();
%>

<%@ include file="Crudjsp.html" %>


</body>
</html>