package com.chainsys.employeeapp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeapp.model.Empdept;
import com.chainsys.employeeapp.model.EmployeeDetail;
import com.chainsys.employeeapp.model.addressmodel;



public interface empdetailsDAO{
	
	//@SqlQuery("select * from employee_details")
	List<EmployeeDetail> showempDetails() throws Exception;

	//List <EmployeeDetail> showemp() throws Exception;
	
	EmployeeDAO joinempdept() throws  Exception;

	
	void jdate() throws Exception;
	
	com.chainsys.employeeapp.dao.EmployeeDAO deptcount() throws Exception;
	
	//@SqlQuery ("select department_name,employee_name,department_id from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?\"")
	 ArrayList<Empdept> empdet(int dId) throws Exception;
	 
	 void selectAllEmployee(int ch,int id) throws Exception;

	//@SqlUpdate ("delete from employee_Details where e_id=+eId" )
	 void deleteEmployeeByEmpId(int eId) throws Exception;
	
	//@SqlUpdate("insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group) values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)")
     boolean insert(EmployeeDetail tr) throws Exception;
  
	//@SqlUpdate ("update employee_details set department_id=?  where e_id=?")
	boolean updateEmpDept(EmployeeDetail ee) throws Exception;

	List<addressmodel> FindAllEmpAddress(String employeeName) throws SQLException, Exception;
}
