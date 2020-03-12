package com.chainsys.employeeapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl;
import com.chainsys.employeeapp.model.EmployeeDetail;

@WebServlet("/listempServlet")

public class listempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<EmployeeDetail> ne = new ArrayList<EmployeeDetail>();
		empdetailsDAOImpl obbj = new empdetailsDAOImpl();
		try {
			ne = obbj.showempDetails();
			request.setAttribute("empp", ne);
			RequestDispatcher dd = request.getRequestDispatcher("listemployees.jsp");
			dd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
