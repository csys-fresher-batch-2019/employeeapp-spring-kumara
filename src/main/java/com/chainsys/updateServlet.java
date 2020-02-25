package com.chainsys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.EmployeeDetail;

@WebServlet("/updateServlet")

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		boolean insert=true;
		com.employee.EMP_t2.empdetailsDAOImpl ee=new com.employee.EMP_t2.empdetailsDAOImpl();
		EmployeeDetail rs = new EmployeeDetail();
		String e=request.getParameter("ID");
		int eee=Integer.parseInt(e);
		String qe=request.getParameter("dept");
		int eeee=Integer.parseInt(qe);
		
		rs.seteId(eee);
		rs.setDepartmentId(eeee);
		try {
			ee.upd(rs);
			String msgs = "Updated Successfully";
			RequestDispatcher rd = request.getRequestDispatcher("AllEmployee.jsp?res1=" + msgs);
			rd.forward(request, response);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
		
}
