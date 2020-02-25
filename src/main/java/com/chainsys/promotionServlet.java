package com.chainsys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.incrementmodel;
import com.employee.salary_t3.salaryDAOImpl;


public class promotionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String s= request.getParameter("number");
		int e= Integer.parseInt(s);
		String w=request.getParameter("num");
		double w1=Double.parseDouble(w);
		salaryDAOImpl i=new salaryDAOImpl();
		incrementmodel ob=new incrementmodel();
      
	try {
		 List<incrementmodel> y = i.increment(w1, e);
		 request.setAttribute("promote",y);
	       RequestDispatcher f= request.getRequestDispatcher("promotionview.jsp");
	       f.forward(request, response);
	       
	} catch (SQLException e1) {
		e1.printStackTrace();
	} catch (Exception e1) {
		e1.printStackTrace();
	}	
	}
		}


