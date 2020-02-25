package com.employee.EMP_t2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.employee.login.EmployeeDAO;
import com.employee.model.Empdept;
import com.employee.model.EmployeeDetail;
import com.employee.model.addressmodel;



public interface empdetailsDAO{
	
	//@SqlQuery("select * from employee_details")
	List<EmployeeDetail> showemp() throws Exception;

	//List <EmployeeDetail> showemp() throws Exception;
	
	EmployeeDAO joinempdept() throws  Exception;

	
	void jdate() throws Exception;
	
	com.employee.login.EmployeeDAO deptcount() throws Exception;
	
	//@SqlQuery ("select department_name,employee_name,department_id from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?\"")
	 ArrayList<Empdept> empdet(int dId) throws Exception;
	 
	 void sel(int ch,int id) throws Exception;

	//@SqlUpdate ("delete from employee_Details where e_id=+eId" )
	 void delete(int eId) throws Exception;
	
	//@SqlUpdate("insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group) values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)")
     boolean insert(EmployeeDetail tr) throws Exception;
  
	//@SqlUpdate ("update employee_details set department_id=?  where e_id=?")
	boolean upd(EmployeeDetail ee) throws Exception;

	List<addressmodel> addr(String employeeName) throws SQLException, Exception;
}
