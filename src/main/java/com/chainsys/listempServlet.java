package com.chainsys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.EmployeeDetail;

/**
 * Servlet implementation class listempServlet
 */
public class listempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<EmployeeDetail> ne= new ArrayList<EmployeeDetail>();
		empdetailsDAOImpl obbj= new empdetailsDAOImpl();
		
		try {
			ne=obbj.showemp();
			request.setAttribute("empp", ne);
			RequestDispatcher dd=request.getRequestDispatcher("listemployees.jsp");
			dd.forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		}}
		
	