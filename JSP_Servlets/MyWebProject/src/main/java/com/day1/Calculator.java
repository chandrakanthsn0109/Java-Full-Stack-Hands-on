package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		PrintWriter out = response.getWriter();
		String trigerForm = request.getParameter("btn");
		
		RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
		rd.include(request, response);


		if(trigerForm.equals("Addition")) {
			out.print("<font color='green'><b> Result: " + (n1 + n2) + "</b></font>");
		}

		if(trigerForm.equals("Subtraction")) {
			out.print("<font color='green'><b> Result: " + (n1 - n2) + "</b></font>");
		}

		if(trigerForm.equals("Multiplication")) {
			out.print("<font color='green'><b> Result: " + (n1 * n2) + "</b></font>");
		}

		if(trigerForm.equals("Division")) {
			out.print("<font color='green'><b> Result: " + (n1 / n2) + "</b></font>");
		}

		out.close();
	}

}
