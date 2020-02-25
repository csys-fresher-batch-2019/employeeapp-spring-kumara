package com.chainsys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.EMP_t2.empdetailsDAOImpl;
import com.employee.model.Empdept;
import com.employee.model.EmployeeDetail;
@WebServlet("/deptviewServlet")

public class deptviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		ArrayList<Empdept> ne= new ArrayList<Empdept>();
		empdetailsDAOImpl obbj= new empdetailsDAOImpl();
		
		try {
			String g=request.getParameter("text");
			int id=Integer.parseInt(g);
			ne=obbj.empdet(id);
			
			request.setAttribute("empp", ne);
			System.out.println(id);
			RequestDispatcher dd=request.getRequestDispatcher("deptview.jsp");
			dd.forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		}
		
		
		
	}
