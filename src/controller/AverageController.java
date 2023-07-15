package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AverageBean;
import model.AverageCalculator;
import model.AverageDao;


@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		String cond=request.getParameter("user_course");
		//AverageCalculator model = new AverageCalculator();
		AverageDao av = new AverageCalculator();
		AverageBean model = new AverageBean();
		model.setNumber1(num1);
		model.setNumber2(num2);
		if(cond.equalsIgnoreCase("+"))
		{
			out.print("inner");
		int result = av.calculate(model);
		out.print(result);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		}
		
		else if(cond.equalsIgnoreCase("-"))
		{	
		int result = av.minus(model);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		}
		
		else if(cond.equalsIgnoreCase("/"))
		{	
		int result = av.divide(model);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		}
		
		else if(cond.equalsIgnoreCase("*"))
		{	
		int result = av.multiply(model);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		}
	}

}

