package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainsys.employeeapp.dao.salaryDAO;
import com.chainsys.employeeapp.model.incrementmodel;
import com.chainsys.employeeapp.model.salarymodel;
import com.chainsys.employeeapp.util.dbconnection;

public class salaryDAOImpl implements salaryDAO {
	
	 private static final Logger logger = LoggerFactory.getLogger(salaryDAOImpl.class);
	 @Override
	public List<salarymodel> tax(int eId) throws SQLException, Exception {		
		String sql="select e.e_id,e.department_id,e.employee_name,sum(sal.salary)as AnnualSalary,sal.year,calculate_tax(?) as tax 	from employee_details e,person_salary_details sal where sal.e_id=? and sal.year = 2019 and e.e_id = ? group by e.employee_name,sal.year,e.department_id,e.e_id";
		  List<salarymodel> list= new ArrayList<>();
       try(Connection con=dbconnection.getConnection();
		PreparedStatement k = con.prepareStatement(sql);)
       {
	 k.setInt(1,  eId );
	 k.setInt(2, eId);
	 k.setInt(3, eId);	
	 try(ResultSet rs=k.executeQuery();) 
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
					}}}
		catch (SQLException e) {
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
				"SELECT e.department_id,s.salary as old_salary, s.salary + (s.salary * ?) as NewSalary,e.e_id, e.employee_name,(FLOOR((sysdate-joining_date)/365)) as no_of_years from employee_details e	inner join person_salary_details s on e.e_id=s.e_id 	where (FLOOR((sysdate-e.joining_date)/365))>=?" ;
		System.out.println(sql);
		try(Connection con=dbconnection.getConnection();
				PreparedStatement k = con.prepareStatement(sql);)			
		{
			k.setDouble(1,increment );
			k.setInt(2, Noofyear );
			try(ResultSet rs=  k.executeQuery();)
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
			  logger.debug(sql1);
				try (PreparedStatement pt = con.prepareStatement(sql1);)
				{  
					incrementmodel n=new incrementmodel();
					pt.setDouble(1,increment);
					pt.setInt(2,Noofyear);
					int row =pt.executeUpdate();
					logger.info("",row);
					}}}
	catch (SQLException e) {
		 {
			 e.printStackTrace();
			 }
	}
		 return jj;	
	}}

	