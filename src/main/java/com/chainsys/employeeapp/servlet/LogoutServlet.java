package com.chainsys.employeeapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(); // Fetch session object

		session.invalidate();
		response.sendRedirect("login.jsp");

		/*
		 * if(session!=null) //If session is not null { session.invalidate();
		 */ // removes all session attributes bound to the session
		// request.setAttribute("errMessage", "You have logged out successfully");
		// RequestDispatcher requestDispatcher =
		// request.getRequestDispatcher("login.jsp");
		// requestDispatcher.forward(request, response);
		// System.out.println("Logged out");
	}
}
