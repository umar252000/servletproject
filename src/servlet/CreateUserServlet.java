package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/addServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUId=1L;
	
	private Connection connection;
	
	public void init(ServletConfig config)
	{
		try {
		ServletContext context=config.getServletContext();//return the ServletContext object 
		System.out.println(context.hashCode());//printing the hashcode of context 
		Class.forName("com.mysql.jdbc.Driver");//forname is a static method of Class class
		connection=DriverManager.getConnection(context.getInitParameter("dbUrl"),
				context.getInitParameter("dbUser"),context.getInitParameter("dbPassword"));
		//dpUrl have a url  of a databases which is in the xml declared as a initparam 
		
		}
		catch (Exception e) {
			e.printStackTrace();//two exception will occur  SQLexception,classnotfound exception
		}
		
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String first = req.getParameter("first");
			System.out.println(first);
			String lastName = req.getParameter("lastname");
			System.out.println(lastName);
			String email = req.getParameter("email");
			System.out.println(email);
			String pass = req.getParameter("password");
			System.out.println(pass);
			int password=Integer.parseInt(pass);
			
			try {
				Statement statement = connection.createStatement();
//				int result = statement.executeUpdate("insert into user(first,lastName,email,password)"
//						+ " values('" + first + "','" + lastName + "','"
//						+ email + "','" + password + "')");
//				
				int result=statement.executeUpdate("insert into user value(first + lastname+email+password)");
				System.out.println("hello12");
				
				PrintWriter out = resp.getWriter();//get writer return the printwriter object
				if (result > 0) {
				
					out.print("<H1>User created</h1>");
			
				} else {
					out.print("<H1>error creating user</h1>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		public void destroy() {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	
	}
}
