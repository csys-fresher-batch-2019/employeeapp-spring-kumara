package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainsys.employeeapp.dao.DepartmentDAO;
import com.chainsys.employeeapp.dao.EmployeeDAO;
import com.chainsys.employeeapp.util.dbconnection;


public  class DepartmentDAOImpl implements DepartmentDAO {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);

			
public void insertdeptment(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception
{
	String sql="insert into departments (?,?,?,?)";
try (Connection con=dbconnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql);)
{
stmt.setInt(1,departmentId);
stmt.setString(2, departmentName);
stmt.setInt(3,managerId);
stmt.setString(4, departmentlocation);
logger.debug(sql);
int row=stmt. executeUpdate();
logger.info("",row);
}
catch (Exception e) {
	 {
		 e.printStackTrace();
		 }	
}
}


public EmployeeDAO empdept() throws Exception {
	String sql="(select  department_name as dept from departments where department_location = 'null')";

	try (Connection con=dbconnection.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);)
	{
		logger.debug(sql);
	if(rs.next())
	{
		String deptt=rs.getString("dept");
		logger.debug(deptt);
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
	 logger.debug(sql);
	int rows=stmt.executeUpdate();
	logger.info("",rows);
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
		logger.debug(sqll);
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















	
