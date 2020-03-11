package com.chainsys.employeeapp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeapp.dao.empdetailsDAO;
import com.chainsys.employeeapp.dao.salaryDAO;
import com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl;
import com.chainsys.employeeapp.dao.impl.salaryDAOImpl;
import com.chainsys.employeeapp.model.EmpNameDepartment;
import com.chainsys.employeeapp.model.EmployeeAddress;
import com.chainsys.employeeapp.model.EmployeeDetail;
import com.chainsys.employeeapp.model.EmployeeSalary;
import com.chainsys.employeeapp.model.SalaryIncrement;

public class EmployeeService {

	empdetailsDAO employeeDAO = new empdetailsDAOImpl();

	// @SqlQuery("select * from employee_details")
	public List<EmployeeDetail> showemp() throws Exception {
		List<EmployeeDetail> result = employeeDAO.showempDetails();
		return result;
	}

	public void jdate(String joiningDate, int empId) throws Exception {
		employeeDAO.jdate(joiningDate, empId);
	}

	public com.chainsys.employeeapp.dao.list deptcount() throws Exception {
		com.chainsys.employeeapp.dao.list ss = employeeDAO.deptcount();
		return ss;
	}

	// @SqlQuery ("select department_name,employee_name,department_id from
	// departments d inner join employee_details e on d.d_id=e.department_id where
	// d.d_id=?\"")
	public ArrayList<EmpNameDepartment> empdet(int dId) throws Exception {
		ArrayList<EmpNameDepartment> sel = employeeDAO.empdet(dId);
		return sel;
	}

	// @SqlUpdate ("delete from employee_Details where e_id=+eId" )
	public void delete(int eId) throws Exception {
		employeeDAO.deleteEmployeeByEmpId(eId);
	}

	// @SqlUpdate("insert into employee_details
	// (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group)
	// values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)")
	public boolean insert(EmployeeDetail tr) throws Exception {
		boolean uu = employeeDAO.insert(tr);
		return uu;
	}

	// @SqlUpdate ("update employee_details set department_id=? where e_id=?")
	public boolean updateEmpDept(EmployeeDetail ee) throws Exception {
		boolean yy = employeeDAO.updateEmpDept(ee);
		return yy;
	}

	public List<EmployeeAddress> FindAllEmpAddress(String employeeName) throws SQLException, Exception {
		List<EmployeeAddress> ss = employeeDAO.FindAllEmpAddress(employeeName);
		return ss;
	}

	salaryDAO salary = new salaryDAOImpl();

	public List<EmployeeSalary> tax(int eId) throws SQLException, Exception {
		List<EmployeeSalary> ii = salary.tax(eId);
		return ii;
	}

	public List<SalaryIncrement> increment(double increment, int Noofyear) throws SQLException, Exception {
		List<SalaryIncrement> io = salary.increment(increment, Noofyear);
		return io;
	}

}
