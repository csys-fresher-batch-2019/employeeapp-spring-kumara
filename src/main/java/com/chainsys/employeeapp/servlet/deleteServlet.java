package com.chainsys.employeeapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteServlet")

public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl ee = new com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl();
		String e = request.getParameter("ID");
		int eee = Integer.parseInt(e);
		try {
			boolean insert = ee.validateEmpID(eee);
			if (insert) {
				ee.deleteEmployeeByEmpId(eee);
				String msgs = "Removed Successfully";
				RequestDispatcher rd = request.getRequestDispatcher("AllEmployee.jsp?res1=" + msgs);
				rd.forward(request, response);
			} else {
				String msg = "Invalid emp-ID";
				response.sendRedirect("delete.jsp?res1=" + msg);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
