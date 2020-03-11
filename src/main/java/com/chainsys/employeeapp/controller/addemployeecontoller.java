package com.chainsys.employeeapp.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.employeeapp.dao.empdetailsDAO;
import com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl;
import com.chainsys.employeeapp.model.EmployeeDetail;

@RestController
@RequestMapping("api")
public class addemployeecontoller {

	empdetailsDAO obj = new empdetailsDAOImpl();

	@PostMapping("/employee")
	public void addemployee(@RequestBody EmployeeDetail tr) {
		try {
			System.out.println(tr);
			obj.insert(tr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/GetAllEmployee")
	public List<EmployeeDetail> Arraylist() {
		try {
			return obj.showempDetails();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
