package com.chainsys.employeeapp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.employeeapp.dao.impl.salaryDAOImpl;
import com.chainsys.employeeapp.model.EmployeeSalary;

@WebServlet("/TaxServlet")

public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		{
			String s = request.getParameter("ID");
			int e = Integer.parseInt(s);
			salaryDAOImpl i = new salaryDAOImpl();
			EmployeeSalary ob = new EmployeeSalary();
			try {
				List<EmployeeSalary> y = i.tax(e);
				request.setAttribute("taxx", y);
				RequestDispatcher f = request.getRequestDispatcher("viewtax.jsp");
				f.forward(request, response);
			} catch (SQLException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

	}
}
