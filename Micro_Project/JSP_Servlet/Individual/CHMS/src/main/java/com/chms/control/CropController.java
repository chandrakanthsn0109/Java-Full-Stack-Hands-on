package com.chms.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chms.bean.Crop;
import com.chms.dao.CropDAO;

/**
 * Servlet implementation class CropController
 */
@WebServlet("/CropController")
public class CropController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	static CropDAO dao = new CropDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("CHMS.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		String operation = request.getParameter("btn");
		if(operation.equalsIgnoreCase("insert")) {
			int cid = Integer.parseInt(request.getParameter("cid"));
			String cname = request.getParameter("cname");
			int cultPer = Integer.parseInt( request.getParameter("cultper"));
			int harCap = Integer.parseInt( request.getParameter("harcap"));
			Crop crp = new Crop(cid,cname,cultPer,harCap);
			int n = dao.insertCrop(crp);
			if (n == 1) {
				out.println("<br><center><font color='green'><h3>Record Inserted</h3></font></center>");
			} 
			else {
				out.println("<br><center><font color='red'><h3>Record Not Inserted</h3></font></center>");
			}

		}
		
		if(operation.equalsIgnoreCase("update")) {
			int cid = Integer.parseInt(request.getParameter("cid"));
			String cname = request.getParameter("cname");
			int cultPer = Integer.parseInt( request.getParameter("cultper"));
			int harCap = Integer.parseInt( request.getParameter("harcap"));
			Crop crp = new Crop(cid,cname,cultPer,harCap);
			int n = dao.updateCrop(crp);
			if (n == 1) {
				out.println("<br><center><font color='green'><h3>Record Updated</h3></font></center>");
			} 
			else {
				out.println("<br><center><font color='red'><h3>Record Not Updated></h3></font></center>");

			}

		}
		
		if(operation.equalsIgnoreCase("delete")) {
			int cid = Integer.parseInt(request.getParameter("cid"));
			int n = dao.deleteCrop(cid);
			if (n == 1) {
				out.println("<br><center><font color='green'><h3>Record Deleted</h3></font></center>");
			} 
			else {
				out.println("<br><center><font color='red'><h3>Record Not Deleted</h3></font></center>");
			}

		}
		
		if(operation.equalsIgnoreCase("find")) {
			int cid = Integer.parseInt(request.getParameter("cid"));
			Crop crp = dao.findCrop(cid);
			if (crp == null) {
				out.println("<br><center><font color='red'><h3>Record Not Found</h3></font><br></center>");
			} 
			else {
				out.println("<br><center><font color='green'><h3>Record Found</h3></font></center>");
				out.println("<center>"+crp.getCid()+" "+crp.getCname()+" "+crp.getCultPeriod()+" "+crp.getHarCap()+"</center><br>");

			}

		}
		
		if(operation.equalsIgnoreCase("findAll")) {
			List<Crop> res = dao.findAllCrop();
			if (res == null) {
				out.println("<br><center><font color='red'><h3>Record Not Found</h3></font><br></center>");
			} 
			else {
				out.println("<br><center><font color='green'><h3>Records Found</h3></font></center>");
				for(Crop c : res) {
					out.println("<center>"+c.getCid()+" "+c.getCname()+" "+c.getCultPeriod()+" "+c.getHarCap()+"</center>");
				}

			}

		}
	}

}
