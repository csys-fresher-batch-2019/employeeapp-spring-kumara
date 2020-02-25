package com.chainsys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.EmployeeDetail;
import com.employee.model.addressmodel;
import com.employee.model.salarymodel;
import com.employee.salary_t3.salaryDAOImpl;

public class AddressdetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	String s= request.getParameter("name");
	
	empdetailsDAOImpl u=new empdetailsDAOImpl();
	addressmodel ob=new addressmodel();
   
try {
	List<addressmodel> yy = u.addr(s);
	request.setAttribute("addres",yy);
	   RequestDispatcher f= request.getRequestDispatcher("Addressview.jsp");
	   f.forward(request, response);
	
} catch (SQLException e) {
	e.printStackTrace();
} catch (Exception e) {
	e.printStackTrace();
}
   
   
   
	
	
	
	
	
	}
	}


