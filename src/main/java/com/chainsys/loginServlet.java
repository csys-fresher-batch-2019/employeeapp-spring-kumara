package com.chainsys;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.login.managerADDImpl;


public class loginServlet extends HttpServlet {
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
     boolean value = false;
	
	com.employee.login.managerADDImpl obj=new com.employee.login.managerADDImpl();
	 String managerName =request.getParameter("Username");
	 String passWord = request.getParameter("password");
	try {
		value = obj.login(managerName, passWord);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(value);
	 if(value) {
		response.sendRedirect("AllEmployee.jsp"); //http://cslh2037:8090/employee-web/AllEmployee.jsp
	 }
	 else
	 {response.sendRedirect("login.jsp?errorMessage=Invalid login");
		// System.out.println("Password Wrong");
		// response.sendRedirect("login.jsp");
	 }
	

}
}