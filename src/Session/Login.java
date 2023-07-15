package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 String name=req.getParameter("name");
	 String password=req.getParameter("password");
	 
	 PrintWriter out=resp.getWriter();
	 
	 if(name.equalsIgnoreCase("umar")&&password.equalsIgnoreCase("umar25"))
	 {
		 HttpSession session=req.getSession();
		session.setAttribute("name1", "messi");
		 
		 RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
		 rd.forward(req, resp);
	 }
	 else {
		resp.setContentType("text/html");
		 RequestDispatcher rd=req.getRequestDispatcher("/session.html");
		rd.include(req, resp);	
	}
 }
}
