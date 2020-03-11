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
import com.chainsys.employeeapp.model.Empdept;
import com.chainsys.employeeapp.model.EmployeeDetail;
import com.chainsys.employeeapp.service.EmployeeService;
@WebServlet("/deptviewServlet")

public class deptviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		ArrayList<Empdept> ne= new ArrayList<Empdept>();
		//empdetailsDAOImpl obbj= new empdetailsDAOImpl();
		EmployeeService ee=new EmployeeService();
		try {
			String g=request.getParameter("text");
			int id=Integer.parseInt(g);
			ne=ee.empdet(id);
			
			request.setAttribute("empp", ne);
			System.out.println(id);
			RequestDispatcher dd=request.getRequestDispatcher("deptview.jsp");
			dd.forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		}
		
		
		
	}
