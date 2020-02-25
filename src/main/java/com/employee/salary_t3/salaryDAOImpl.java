package com.employee.salary_t3;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.employee.model.dbconnection;
import com.employee.model.incrementmodel;
import com.employee.model.salarymodel;

public class salaryDAOImpl implements salaryDAO {

	@Override
	public List<salarymodel> tax(int eId) throws SQLException, Exception {
		
	
	
		String sql="select e.e_id,e.department_id,e.employee_name,sum(sal.salary)as AnnualSalary,sal.year,calculate_tax("+eId+") as tax 	from employee_details e,person_salary_details sal where sal.e_id="+eId+" and sal.year = 2019 and e.e_id = "+eId+" group by e.employee_name,sal.year,e.department_id,e.e_id";
		  List<salarymodel> list= new ArrayList<>();
try(Connection con=dbconnection.getConnection();
				Statement k=con.createStatement();
						ResultSet rs=  k.executeQuery(sql);)
		{
			while(rs.next())
					{
					salarymodel ob=new salarymodel();
					ob.seteId(rs.getInt("e_id"));
					ob.setDepartmentId(rs.getInt("department_id"));
					ob.setEmployeeName(rs.getString("employee_name"));
					ob.setYear(rs.getInt("year"));
					ob.setTax(rs.getInt("tax"));
					ob.setAnnualSalary(rs.getInt("AnnualSalary"));
					
					list.add(ob);
					
					}}
		
		
		catch (Exception e) {
			 {
				 e.printStackTrace();
				 }
		}
			 return list;	
	
	
	}

	@Override
	public List<incrementmodel> increment(double increment,int Noofyear) throws SQLException, Exception {
		
		List jj= new ArrayList<>();
		String sql=
				"SELECT e.department_id,s.salary as old_salary, s.salary + (s.salary * "+increment+") as NewSalary,e.e_id, e.employee_name,(FLOOR((sysdate-joining_date)/365)) as no_of_years from employee_details e	inner join person_salary_details s on e.e_id=s.e_id 	where (FLOOR((sysdate-e.joining_date)/365))>="+Noofyear+"" ;
		System.out.println(sql);
		try(Connection con=dbconnection.getConnection();
				Statement k=con.createStatement();
				
						ResultSet rs=  k.executeQuery(sql);)
		{
			while(rs.next())
					{
				incrementmodel i=new incrementmodel();
				i.seteId(rs.getInt("e_id"));
				i.setDepartmentId(rs.getInt("department_id"));
				i.setEmployeeName(rs.getString("employee_name"));
				i.setOldSalary(rs.getInt("old_salary"));
				i.setNewSalary(rs.getInt("NewSalary"));
				i.setNoofyear(rs.getInt("No_of_years"));
				jj.add(i);
					}
				String sql1=" update  person_salary_details p  set  p.salary=p.salary + (p.salary * ?)    where exists ( select 1 from  employee_details e where (FLOOR((sysdate-e.joining_date)/365))>=? and e.e_id=p.e_id )";
			   System.out.println(sql1);
				try (PreparedStatement pt = con.prepareStatement(sql1);)
				{  
					incrementmodel n=new incrementmodel();

					pt.setDouble(1,increment);
					pt.setInt(2,Noofyear);
			
					int row =pt.executeUpdate();
					System.out.println(row);
					
				

					}}
		
	
	catch (Exception e) {
		 {
			 e.printStackTrace();
			 }
	}
		 return jj;	

	}}

	