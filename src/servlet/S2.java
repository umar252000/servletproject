package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>welocome to s2</h2>");
//		out.println("hello");
		
	//	int str =(int)req.getAttribute("sum");
//		out.println("<h1>"+str+"</h1>");
		
		int nn1=Integer.parseInt(req.getParameter("n1"));
		int nn2=Integer.parseInt(req.getParameter("n2"));
		
//		int p=nn1*nn2;
//		out.println("<h2>"+ str+"</h2>");
//		out.println("multiply"+" "+p);
//		resp.sendRedirect("https://www.javatpoint.com/java-tutorial");
		
//		String s=req.getParameter("name");
//		out.print("<h2>your name is +"+s+"</h2>");
	//	out.println("<a href=S2 ?user="+name+"'>click for second sevlet</a>");

		
	}
}
