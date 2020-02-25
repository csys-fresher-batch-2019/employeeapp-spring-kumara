package com.chainsys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		com.employee.EMP_t2.empdetailsDAOImpl ee=new com.employee.EMP_t2.empdetailsDAOImpl();
		String e=request.getParameter("ID");
		int eee=Integer.parseInt(e);
		try {
			ee.delete(eee);
			String msgs = "Removed Successfully";
			RequestDispatcher rd = request.getRequestDispatcher("AllEmployee.jsp?res1=" + msgs);
			rd.forward(request, response);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
