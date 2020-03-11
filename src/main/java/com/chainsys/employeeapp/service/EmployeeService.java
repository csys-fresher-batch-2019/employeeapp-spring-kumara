package com.chainsys.employeeapp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeapp.dao.EmployeeDAO;
import com.chainsys.employeeapp.dao.impl.empdetailsDAOImpl;
import com.chainsys.employeeapp.dao.impl.salaryDAOImpl;
import com.chainsys.employeeapp.model.Empdept;
import com.chainsys.employeeapp.model.EmployeeDetail;
import com.chainsys.employeeapp.model.addressmodel;
import com.chainsys.employeeapp.model.incrementmodel;
import com.chainsys.employeeapp.model.salarymodel;

public class EmployeeService {
	
	empdetailsDAOImpl obj=new empdetailsDAOImpl();
	
		//@SqlQuery("select * from employee_details")
		List<EmployeeDetail> showemp() throws Exception{
			List<EmployeeDetail> result= obj.showempDetails();
		     return result; 
		}
		
		EmployeeDAO joinempdept() throws  Exception{
               EmployeeDAO yo=   obj.joinempdept();
               return yo;
		}
		
		void jdate() throws Exception{
			obj.jdate();}
		
		com.chainsys.employeeapp.dao.EmployeeDAO deptcount() throws Exception{
			com.chainsys.employeeapp.dao.EmployeeDAO ss=obj.deptcount();
			return ss;}
			
		
		//@SqlQuery ("select department_name,employee_name,department_id from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?\"")
	  public	 ArrayList<Empdept> empdet(int dId) throws Exception{
			 ArrayList<Empdept> sel= obj.empdet(dId);
		     return sel; 
		}
		 
		 void selectAllEmployee(int ch,int id) throws Exception{
			 obj.selectAllEmployee(ch, id);
		 }

		//@SqlUpdate ("delete from employee_Details where e_id=+eId" )
		 void delete(int eId) throws Exception{
			 obj.deleteEmployeeByEmpId(eId);}
		
		//@SqlUpdate("insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group) values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)")
	 public    boolean insert(EmployeeDetail tr) throws Exception{
	    	 boolean uu=obj.insert(tr);
	    			 return uu;
	    	 }
	  
		//@SqlUpdate ("update employee_details set department_id=?  where e_id=?")
		boolean updateEmpDept(EmployeeDetail ee) throws Exception{
			boolean yy = obj.updateEmpDept(ee);
			return yy;}

		List<addressmodel> FindAllEmpAddress(String employeeName) throws SQLException, Exception{
			List<addressmodel> ss=obj.FindAllEmpAddress(employeeName);
			return ss;
		}
		salaryDAOImpl oi= new salaryDAOImpl();
		
		List<salarymodel> tax(int eId) throws SQLException, Exception{
		List<salarymodel> ii=oi.tax(eId);
		return ii;}

		List<incrementmodel> increment(double increment, int Noofyear) throws SQLException, Exception{
			List<incrementmodel> io=oi.increment(increment, Noofyear);
			return io;
	}
		
}

