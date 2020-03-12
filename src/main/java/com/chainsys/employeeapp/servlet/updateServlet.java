package com.chainsys.employeeapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.employeeapp.model.EmployeeDetail;

@WebServlet("/updateServlet")

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl ee = new com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl();
		EmployeeDetail rs = new EmployeeDetail();
		String e = request.getParameter("ID");
		int eee = Integer.parseInt(e);
		String qe = request.getParameter("dept");
		int eeee = Integer.parseInt(qe);

		rs.seteId(eee);
		rs.setDepartmentId(eeee);
		try {
			boolean insert=ee.validateEmpID(eee); 
			if(insert) {
			ee.updateEmpDept(rs);
			String msgs = "Updated Successfully";
			RequestDispatcher rd = request.getRequestDispatcher("AllEmployee.jsp?res1=" + msgs);
			rd.forward(request, response);
		}else {
			String msg = "Invalid emp-ID";
			response.sendRedirect("update.jsp?res1="+msg);
		}
			} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
