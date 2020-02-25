package com.employee.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.model.addman;
import com.employee.model.dbconnection;

public class managerADDImpl implements addmanagerDAO {

	
	public boolean addmanager(addman add) throws Exception {
		boolean insert = true;
        String sql="insert into manager(manager_name,email,dob,mob_num,pass_word,gender,manager_id) values(?,?,?,?,?,?,Update_sequence.nextval)";

		try(
		 Connection connection = dbconnection.getConnection();
				 PreparedStatement k=connection.prepareStatement(sql);)
		{
	       System.out.println(sql); 
	      
	       k.setString(1, add.getManagerName());
	       k.setString(2, add.getEmail());
	       k.setDate(3, add.getDob());
	       k.setLong(4, add.getMobNum());
	       k.setString(5, add.getPassWord());
	       k.setString(6, add.getGender());
	       int i=k.executeUpdate(); 
	       
	       if(i>0)  {
	    	   System.out.print("You are successfully registered..."); 
	       insert=true; 
		}
		else { 
			insert =false;
		}
				
		return insert;
		}
	}

	public boolean login(String managerName, String passWord) throws Exception {
		
		    boolean result = false;
			String sql=	"select pass_word from Manager where manager_name='"+managerName+"'" ;  
				
				
				      String password1=null;
				try(Connection  connection =dbconnection.getConnection();
						ResultSet rs=connection.createStatement().executeQuery(sql); ) 
				{
				if (rs.next())
				{
					 password1=rs.getString("pass_word");
					
				}
				if(password1 != null)
				{
				if(password1.equals(passWord))
				{
					
					//System.out.println(managerName+","+passWord+"");
					System.out.println("log in");
				 result = true;
				}
				else
				{
					System.out.println("password Wrong");
					 result = false;
				}
				}
				else 
				{
					System.out.println("userName wrong");
				}
       connection.close();
				}
       catch (Exception e)
       {
    	   e.printStackTrace();
       }
		return result;
	}} 

	


