package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/sourceServlet")
public class SourceServlet extends HttpServlet {
   private static final long serialVersionUID=1L;
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	   
//   Cookie[] cookies=req.getCookies();
//   for(int i=0;i<cookies.length;i++)
//   {
//	   System.out.println(cookies[i].getName());
//	   System.out.println(cookies[i].getValue());
	   
	   
//   }
   
//   resp.addCookie(new Cookie("id","123"));
   String userName=req.getParameter("userName");
   HttpSession session=req.getSession();
   session.setAttribute("user",userName );
   resp.setContentType("text/html");
   PrintWriter out=resp.getWriter();
   out.println("<a href='targetServlet'>Click here to get a user</a>");  
   
   }
}
