package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>welcome123</h2>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_Email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		
		String cond=req.getParameter("condition");
		
		if(cond.equals("checked"))
		//{
		//	out.println("<h2>Name:"+name+"</h2>");
		//	out.println("<h2>Email:"+email+"</h2>");
		//	out.println("<h2>gender:"+gender+"</h2>");
		//	out.println("<h2>course:"+course+"</h2>");
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","umar25");
				 PreparedStatement psmt=con.prepareStatement("insert into registers values(?,?,?,?)");
					
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
						
						psmt.setString(1,name);
						psmt.setString(2,email);
						psmt.setString(3,gender);
						psmt.setString(4,course);
						
						int i=psmt.executeUpdate();
						if(i>0)
							System.out.println("record inserted");

							else 
							System.out.println("no record inserted");

				} catch (Exception e) {
					e.printStackTrace();
				}

		}
	//	else {
			//System.out.println("terms and condition not accepted ");
		//}
/*		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register\",\"root\",\"umar25");
		 PreparedStatement psmt=con.prepareStatement("insert into registers values(?,?,?,?)");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				psmt.setString(1,name);
				psmt.setString(2,email);
				psmt.setString(3,gender);
				psmt.setString(4,course);
				
				int i=psmt.executeUpdate();
				if(count>0)
					System.out.println(count+"record inserted");

					else 
					System.out.println("no record inserted");

		} catch (Exception e) {
			
		}*/
				
	}


