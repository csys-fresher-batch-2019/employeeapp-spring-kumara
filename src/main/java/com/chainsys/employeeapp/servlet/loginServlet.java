package com.chainsys.employeeapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")

public class loginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean value = false;

		com.chainsys.employeeapp.dao.impl.managerADDImpl obj = new com.chainsys.employeeapp.dao.impl.managerADDImpl();
		String managerName = request.getParameter("Username");
		String passWord = request.getParameter("password");
		try {
			value = obj.login(managerName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(value);
		if (value) {
			response.sendRedirect("AllEmployee.jsp"); // http://cslh2037:8090/employee-web/AllEmployee.jsp
		} else {
			response.sendRedirect("login.jsp?errorMessage=Invalid login");
			// System.out.println("Password Wrong");
			// response.sendRedirect("login.jsp");
		}

	}
}