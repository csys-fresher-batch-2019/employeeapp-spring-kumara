package com.chainsys;

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

import com.employee.mail.bloodDAOImpl;
import com.employee.mail.bloodneed;
import com.employee.model.bloodmodel;
@WebServlet("/SendMaill")

public class SendMaill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String gmail = "kumarusaro@gmail.com";
		String pass = "usosbrenz";
		// String mailId=bloodmodel.getGmail();

		String sub = "Blood Needed";
		String hospitalname = request.getParameter("Hosname");
		HttpSession session = request.getSession();
		String bloodss = (String) session.getAttribute("bb");
		String patientName = request.getParameter("name");
		String patDiag = request.getParameter("reason");
		String Locat = request.getParameter("locate");
		String mob = request.getParameter("phone");
		long l = Long.parseLong(mob);
		String bloodgroups = request.getParameter("bloodgroup");

		// System.out.println("SendMail:" + search);
		PrintWriter out = response.getWriter();
		// System.out.println(search);
		// HttSession
		bloodneed b = new bloodneed();
		bloodDAOImpl ob = new bloodDAOImpl();
		try {
			ArrayList<bloodmodel> list = new ArrayList<bloodmodel>();
			list = ob.blood(bloodss);
			for (bloodmodel bloodmodel : list) {
				String mailId = bloodmodel.getGmail();
				bloodneed.send(gmail, pass, mailId, sub, bloodss, hospitalname, patientName, patDiag, l, Locat);
			}
			String msg = "Mail sended";
			RequestDispatcher rd = request.getRequestDispatcher("bloodsearch.jsp?res=" + msg);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
