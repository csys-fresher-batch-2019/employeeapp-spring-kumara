package com.employee.Dept_T1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employee.login.EmployeeDAO;
import com.employee.model.dbconnection;


public  class DepartmentDAOImpl implements DepartmentDAO {

			
public void inserdept(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception
{

try (Connection con=dbconnection.getConnection();
		Statement stmt=con.createStatement();)
{
String sql="insert into departments (d_id,department_name,manager_id,department_location) values("+departmentId+",'"+departmentName+"',"+managerId+",'"+departmentlocation+"')";
System.out.println(sql);
int row=stmt. executeUpdate(sql);
System.out.println(row);
}
catch (Exception e) {
	 {
		 e.printStackTrace();
		 }	
}
}


public EmployeeDAO empdept() throws Exception {
	// TODO Auto-generated method stub
	String sql="(select  department_name as dept from departments where department_location = 'null')";

	try (Connection con=dbconnection.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);)
	{
	System.out.println(sql);
	if(rs.next())
	{
		String deptt=rs.getString("dept");
		
		System.out.println(deptt);
	}
		con.close();	
	}
	catch (Exception e) {
		 {
			 e.printStackTrace();
			 }
		
	}
	return null;
}

public void deptadd(String deptName,int deptId)throws Exception{
	String sql="update departments set department_name= ? where d_id= ?";

	try (Connection con=dbconnection.getConnection();
			PreparedStatement stmt=con.prepareStatement(sql);  )
	{
	
	
     stmt.setString(1,deptName);
	 stmt.setInt(2,deptId);
	//Statement stmt=con.createStatement();
	System.out.println(sql);
	int rows=stmt.executeUpdate();
	System.out.println(rows);
	con.close();
	}
	catch (Exception e) {
		 {
			 e.printStackTrace();
			 }
	}
	
}


public int getNoOfdept(String departmentLocation) throws Exception {
	String sql="select count(department_name) as dept from departments where department_location=?";

	try (Connection con=dbconnection.getConnection();
			PreparedStatement stmtt=con.prepareStatement(sql);
			ResultSet rs= stmtt.executeQuery();)
	{
	stmtt.setString(1,departmentLocation);
		while(rs.next())
	{
		
		String sqll=rs.getString("dept");
		System.out.println(sqll);
	}
	con.close();
	}
	catch (Exception e) {
		 {
			 e.printStackTrace();
			 }
	}
	return 0;
	
}
}















	
