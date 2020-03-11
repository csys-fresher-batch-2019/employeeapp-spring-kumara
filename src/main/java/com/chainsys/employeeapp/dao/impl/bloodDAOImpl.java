package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.chainsys.employeeapp.dao.bloodDAO;
import com.chainsys.employeeapp.model.bloodmodel;
import com.chainsys.employeeapp.util.dbconnection;

public class bloodDAOImpl implements bloodDAO {

	public ArrayList<bloodmodel> Findempbloodgrp(String BloodGroup) throws Exception{
		String sql="select * from employee_details where blood_group=?"; 
        ArrayList<bloodmodel> list=new ArrayList<>();
		try (
			Connection con=dbconnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql);)
		{	
				stmt.setString(1,BloodGroup);
				try(ResultSet rs=stmt.executeQuery();)
		{
		while(rs.next())
		{
			bloodmodel obj = new bloodmodel();
             obj.seteId(rs.getInt("e_id"));
             obj.setEmployeeName(rs.getString("employee_name"));
            obj.setDepartmentId(rs.getInt("department_id"));
            obj.setGmail(rs.getString("gmail"));
            obj.setEmployeeMobnum(rs.getLong("employee_mobnum"));
        list.add(obj);
		}
		}
		catch (Exception e) {
			 {
				 e.printStackTrace();
			}
		}
		return list;
	
		}
	}}


