package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.swing.text.html.HTML;

public class Firstservlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/HTML");
		PrintWriter  out=arg1.getWriter();
		
		out.println("<Html>");
		out.println("<body>");
		out.println("<h2>hello<h2>");
		out.println("</body>");
		out.println("</Html>");
		
		
	}



	

}
