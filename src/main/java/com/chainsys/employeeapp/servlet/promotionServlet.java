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
import com.chainsys.employeeapp.model.SalaryIncrement;
@WebServlet("/promotionServlet")


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
		SalaryIncrement ob=new SalaryIncrement();
      
	try {
		 List<SalaryIncrement> y = i.increment(w1, e);
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


