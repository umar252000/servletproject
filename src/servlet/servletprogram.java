package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletprogram extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("welcome");
		
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		String choice=req.getParameter("choice");
		int c=0;
		switch (choice) {
		case "*":
			
			out.print(a*b);
			break;
		case "+":
			
			out.print(a+b);
			break;

		default:
			break;
		}
		
		 c=a+b;
		out.println(c);
		
		
		
		
	}

}
