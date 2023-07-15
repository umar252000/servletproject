package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptionhandler { 
	
	Connection conn;
	
	public Connection m1() throws SQLException, ClassNotFoundException
	{
		if(conn!=null)
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "umar25");
	}
		return conn;
		
		
	}
}
