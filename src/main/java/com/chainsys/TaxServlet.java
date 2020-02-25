package com.chainsys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.salarymodel;
import com.employee.salary_t3.salaryDAOImpl;


public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		{
			
		String s= request.getParameter("ID");
		int e= Integer.parseInt(s);
		salaryDAOImpl i=new salaryDAOImpl();
		salarymodel ob=new salarymodel();
      
	try {
		 List<salarymodel> y = i.tax(e);
		 request.setAttribute("taxx",y);
	       RequestDispatcher f= request.getRequestDispatcher("viewtax.jsp");
	       f.forward(request, response);
	       
	} catch (SQLException e1) {
		e1.printStackTrace();
	} catch (Exception e1) {
		e1.printStackTrace();
	}
      
		
	}

}}
