package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formservlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
//	out.println("welcome in form servlet");
	
	String name=req.getParameter("user_name");
	String email=req.getParameter("user_email");
	String gender=req.getParameter("user_gender");
	String course=req.getParameter("course");
	
	String cond=req.getParameter("condition");
	//System.out.println(cond);
	if(cond!=null)
	{
	if(cond.equals("checked"))
	{
		out.println("<h2>name:"+name+"</h2>");
		out.println("<h2>email:"+email+"</h2>");
		out.println("<h2>gender:"+gender+"<h2>");
		out.println("<h2>course:"+course+"</h2>");
		
//		
		RequestDispatcher r=req.getRequestDispatcher("Form1servlet");
		r.forward(req, resp);
//		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","umar25");
//			 PreparedStatement psmt=con.prepareStatement("insert into registers values(?,?,?,?)");
//				
//				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//					
//					psmt.setString(1,name);
//					psmt.setString(2,email);
//					psmt.setString(3,gender);
//					psmt.setString(4,course);
//					
//					int i=psmt.executeUpdate();
//					if(i>0)
//						System.out.println("record inserted");
//
//						else 
//						System.out.println("no record inserted");
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
	}
	}
	else {
	
	
		out.println("<h2 style=color:red>term and condition not accepted</h2>");
		RequestDispatcher rd=req.getRequestDispatcher("index1.html");
		rd.include(req,resp);
		
	}
	}
}

