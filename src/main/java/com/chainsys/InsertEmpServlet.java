package com.chainsys;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.EmployeeDetail;

@WebServlet("/InsertEmpServlet")

public class InsertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get form values
		
		com.employee.EMP_t2.empdetailsDAOImpl ee=new com.employee.EMP_t2.empdetailsDAOImpl();
		EmployeeDetail fd = new EmployeeDetail();
		String date=request.getParameter("joindate");
		String bdate=request.getParameter("dob");
		Long athar=Long.parseLong(request.getParameter("adhar"));
		Long phone=Long.parseLong(request.getParameter("phone"));

		LocalDate bldate=LocalDate.parse(bdate);
		LocalDate ldate=LocalDate.parse(date);
		fd.setEmployeeName(request.getParameter("name"));
		fd.setGender(request.getParameter("gender"));
		fd.setBirthDate(bldate);
		fd.setJoiningDate(ldate);
		fd.setPanCard(request.getParameter("pancard"));
		fd.setAdharNum(athar);
		fd.setEmployeeMobnum(phone);
		//Convert String to appropriate type
		
		//Store form values in model object =set all values
		
		fd.setGmail(request.getParameter("email"));
		fd.setBloodGroup(request.getParameter("bloodGroup"));
		try {
			System.out.println("call method");
			ee.insert(fd);
			//System.out.println("executed");
			String msgs = "Inserted Successfully";
			RequestDispatcher rd = request.getRequestDispatcher("AllEmployee.jsp?res1=" + msgs);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 


}
