package com.chainsys.employeeapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.employeeapp.dao.impl.bloodDAOImpl;
import com.chainsys.employeeapp.model.SearchBlood;

@WebServlet("/SearchBloodGroup")

/**
 * Servlet implementation class SearchBloodGroup
 */
public class SearchBloodGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String bloodGroup1 = request.getParameter("bloodgroup");
		System.out.println(bloodGroup1);
		HttpSession session = request.getSession();
		session.setAttribute("bb", bloodGroup1);
		PrintWriter out = response.getWriter();
		bloodDAOImpl bloodDonars = new bloodDAOImpl();
		ArrayList<SearchBlood> list = new ArrayList<SearchBlood>();

		try {
			list = bloodDonars.Findempbloodgrp(bloodGroup1);
			System.out.println(list);
			request.setAttribute("blood", list);
			RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
			HttpSession ses = request.getSession();
			ses.setAttribute("blood", bloodGroup1);
			rd.forward(request, response);

			/*
			 * for (BloodGroup bloodGroup : list) {
			 * out.print(bloodGroup.getBloodGroup()+"\t"+bloodGroup.getEmpName()+"\t"+
			 * bloodGroup.getEmail()+"</br>"); }
			 */
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
