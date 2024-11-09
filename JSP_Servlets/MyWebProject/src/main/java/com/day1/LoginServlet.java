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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(userName.equals("chandrasn") && password.equals("Chandra@7")) {
//			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
//			rd.forward(request, response);
			response.sendRedirect("LoginSuccess.jsp");
		}
		else {
//			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//			rd.include(request, response);
//			out.println("<font color='red'><b>Invalid Username and Password</b></font>");
			response.sendRedirect("LoginFail.jsp");
		}

	}

}
