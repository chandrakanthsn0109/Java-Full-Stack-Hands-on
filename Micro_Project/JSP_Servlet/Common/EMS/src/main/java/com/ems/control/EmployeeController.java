package com.ems.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	static EmployeeDAO dao = new EmployeeDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("EMS.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		String operation = request.getParameter("btn");
		if(operation.equalsIgnoreCase("insert")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			int esal = Integer.parseInt( request.getParameter("esal"));
			Employee emp = new Employee(eid,ename,esal);
			int n = dao.insertEmployee(emp);
			if (n == 1) {
//				out.println("<br><center><font color='green'><h3>Record Inserted</h3></font></center>");
				response.sendRedirect("Result.jsp?status=success&msg=Record Inserted Successfully");
			} 
			else {
//				out.println("<br><center><font color='red'><h3>Record Not Inserted</h3></font></center>");
				response.sendRedirect("Result.jsp?status=success&msg=Record Not Inserted");
			}

		}
		
		if(operation.equalsIgnoreCase("update")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			int esal = Integer.parseInt( request.getParameter("esal"));
			Employee emp = new Employee(eid,ename,esal);
			int n = dao.updateEmployee(emp);
			if (n == 1) {
				out.println("<br><center><font color='green'><h3>Record Updated</h3></font></center>");
			} 
			else {
				out.println("<br><center><font color='red'><h3>Record Not Updated></h3></font></center>");
			}


		}
		
		if(operation.equalsIgnoreCase("delete")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			int n = dao.deleteEmployee(eid);
			if (n == 1) {
				out.println("<br><center><font color='green'><h3>Record Deleted</h3></font></center>");
			} 
			else {
				out.println("<br><center><font color='red'><h3>Record Not Deleted</h3></font></center>");
			}

		}
		
		if(operation.equalsIgnoreCase("find")) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			Employee emp = dao.findEmployee(eid);
			if (emp == null) {
				out.println("<br><center><font color='red'><h3>Record Not Found</h3></font><br></center>");
			} 
			else {
				out.println("<br><center><font color='green'><h3>Record Found</h3></font></center>");
				out.println("<center>"+emp.getEid()+" "+emp.getEname()+" "+emp.getEsalary()+"</center><br>");
			}

		}
		
		if(operation.equalsIgnoreCase("findAll")) {
			List<Employee> res = dao.findAllEmployee();
			if (res == null) {
				out.println("<br><center><font color='red'><h3>Record Not Found</h3></font><br></center>");
			} 
			else {
				out.println("<br><center><font color='green'><h3>Records Found</h3></font></center>");
				for(Employee e : res) {
					out.println("<center>"+e.getEid()+" "+e.getEname()+" "+e.getEsalary()+"</center>");
				}

			}

		}
	}
}
