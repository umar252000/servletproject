package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("welcome");
		
		String a=req.getParameter("n1");
		String b=req.getParameter("n2");
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		int s=i+j;
		out.println("<h2>"+s+"</h2>");
		
//		String name=req.getParameter("user_name");
		
		
//		int s=i+j;
	//	req.removeAttribute("");
	//	req.setAttribute("sum", s);
	//		out.print("<h2>your name is +"+name+"</h2>");
//		out.println("<a href=s2 ?user="+name+"'>click for second sevlet</a>");
		RequestDispatcher rd=req.getRequestDispatcher("ss1");
		rd.forward(req, resp);
//		
		
	}
}
