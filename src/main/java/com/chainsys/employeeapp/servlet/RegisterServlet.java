package com.chainsys.employeeapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		boolean insert = true;
		com.chainsys.employeeapp.model.addman ob=new com.chainsys.employeeapp.model.addman();
		ob.setManagerName(request.getParameter("name"));
	    ob.setEmail(request.getParameter("email"));
	    ob.setDob(Date.valueOf(request.getParameter("dob").toString()));
	    ob.setMobNum(Long.parseLong(request.getParameter("number")));
	    ob.setPassWord(request.getParameter("password"));
	    ob.setGender(request.getParameter("gender"));
	   // PrintWriter out = response.getWriter();
	   // out.println(ob.getManagerName());
	   // out.println(ob.getEmail());
	    //out.println(ob.getDob());
	   // out.println(ob.getMobNum());
	  //  out.println(ob.getPassWord());
	  //  out.println(ob.getGender());
	    
	    try {
	  com.chainsys.employeeapp.dao.impl.managerADDImpl obj=new com.chainsys.employeeapp.dao.impl.managerADDImpl();
	 insert = obj.addmanager(ob);
	 if(insert)
	 { response.sendRedirect("login.jsp");
	 }else { response.sendRedirect("Register.jsp");
	 }
	}catch (Exception e2) {System.out.println(e2.getMessage());}  
    
	//out.close();  
	}}

