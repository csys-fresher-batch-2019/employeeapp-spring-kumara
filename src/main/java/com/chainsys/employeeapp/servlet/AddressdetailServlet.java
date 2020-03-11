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

import com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl;
import com.chainsys.employeeapp.model.EmployeeAddress;
@WebServlet("/AddressdetailServlet")
public class AddressdetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	String s= request.getParameter("name");
	
	empdetailsDAOImpl u=new empdetailsDAOImpl();
	EmployeeAddress ob=new EmployeeAddress();
   
try {
	List<EmployeeAddress> yy = u.FindAllEmpAddress(s);
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


