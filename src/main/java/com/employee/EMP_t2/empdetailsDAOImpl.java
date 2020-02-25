package com.employee.EMP_t2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import com.employee.model.DeptModel;
import com.employee.model.Empdept;
//import com.employee.EmployeeDAO;
import com.employee.model.EmployeeDetail;
import com.employee.model.addressmodel;
import com.employee.model.dbconnection;

public  class empdetailsDAOImpl implements empdetailsDAO {

	/*private String salary;
	private String employeeName;
	private String eId;*/
      
	
	public List<EmployeeDetail> showemp() throws Exception {
		List<EmployeeDetail> ne= new ArrayList<>();
		String sql="select * from employee_details";
		try (Connection con=dbconnection.getConnection();
				Statement k=con.createStatement();
				ResultSet rs=  k.executeQuery(sql);)
		{
		
		
		if(rs.next())
		{
			
		do {
			EmployeeDetail emp= new EmployeeDetail();
			
			emp.seteId(rs.getInt("e_id"));
			emp.setEmployeeName(rs.getString("employee_name"));
			emp.setGender(rs.getString("gender"));
			emp.setBirthDate(rs.getDate("birth_date").toLocalDate());
			
			
			emp.setJoiningDate(rs.getDate("joining_date").toLocalDate());
            emp.setPanCard(rs.getString("pan_card"));
            emp.setGmail(rs.getString("gmail"));
            emp.setBloodGroup(rs.getString("blood_group"));
            ne.add(emp);
            
           
		}while(rs.next());
		}else {
			System.out.println("Record not Found");
		}
		}
		catch (Exception e) {
			 {
				 e.printStackTrace();
				 }

		}
		return ne;
	      
	      }

	public com.employee.login.EmployeeDAO joinempdept() throws Exception {
		
		String sql="select employee_details.employee_name ,departments.manager_id,count(department_name) as department_count from departments join employee_details on departments.manager_id=employee_details.e_id group by departments.manager_id,employee_details.employee_name";

			try(Connection con=dbconnection.getConnection();
			Statement k=con.createStatement();
					ResultSet rs=  k.executeQuery(sql);)
			{
		System.out.println(sql.toString());
		
		while(rs.next())
		{
		String employeeName= rs.getString("employee_name\n");
		String employeeName2= rs.getString("manager_id");
		String employeeName3=rs.getString("department_count");
		System.out.println(employeeName +","+employeeName2+","+employeeName3+"");	
	
	} 
			}
			catch (Exception e) {
				 {
					 e.printStackTrace();
				 }
			}
	
		return null;}

	
	
	public void jdate()throws Exception {
		String joiningDate = "2019-04-12";
		int empId=2;
		LocalDate kt=LocalDate.parse(joiningDate);
		System.out.println(kt);
		 Date kt1=Date.valueOf(kt);
		 String sql="update employee_details set joining_date=? where e_id=? ";
		 try(Connection con=dbconnection.getConnection();
				 PreparedStatement stmt=con.prepareStatement(sql);)
			
		 {
			
			stmt.setDate(1,kt1);
			stmt.setInt(2,empId);
			System.out.println(sql);
			int rows = stmt. executeUpdate();
			System.out.println(rows);
		 }
			
		 }

	public com.employee.login.EmployeeDAO deptcount() throws Exception {
		// TODO Auto-generated method stub
		String sql="select department_id,department_name,count(employee_name) as emp_count from departments  inner join employee_details  on departments.d_id=employee_details.department_id  group by department_id,department_name order by department_id asc";

		
		 try( Connection con=dbconnection.getConnection();
				 Statement k=con.createStatement();
				 ResultSet rs=  k.executeQuery(sql);)
		 {
			System.out.println(sql);
			
			//Statement stmt=con.createStatement();
			
			while(rs.next())
			{
				String departmentName =rs.getString("department_name");
			String employeeName= rs.getString("department_id");
			
			int employeeName2=rs.getInt("emp_count");
			System.out.println(employeeName+","+departmentName+","+employeeName2+"");
					
	}        
		 }
			catch (Exception e) {
				 {
					 e.printStackTrace();
					 }	
			}
			return null;

}

	public ArrayList<Empdept> empdet(int dId) throws Exception {
        ArrayList<Empdept> list=new ArrayList<>();

		
		String sql="select e_id,department_id,employee_name, department_name,department_location from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?";
		//Statement rss= con.createStatement();
		try (
			Connection con=dbconnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql);)
		{	
				stmt.setInt(1,dId);
				try(ResultSet rs=stmt.executeQuery();)
				
		{
		
		
		
		while(rs.next())
		{
		 Empdept emp=new Empdept();
		emp.seteId(rs.getInt("e_id"));
		emp.setDepartmentId(rs.getInt("department_id"));
		emp.setEmployeeName(rs.getString("employee_name"));
		emp.setDepartmentName(rs.getString("department_name"));
		emp.setDepartmentLocation(rs.getString("department_location"));
		
         list.add(emp);
        
           // System.out.println(department_name+","+employee_name+","+department_id+"");
           // employeeDetail ob= new employeeDEtail();
            
		}
		
		
		}
		catch (Exception e) {
			 {
				 e.printStackTrace();
				 
			}
		}
		
		return list;
	}}

	
	@Override
	public void delete(int eId) throws Exception {
		
		 try (Connection connection = dbconnection.getConnection();
				 Statement st = connection.createStatement();)
		 {
			 String sql = "delete from employee_Details where e_id="+eId;
			    System.out.println(sql);
			     
			    st.executeUpdate(sql);
			     
			    st.close();
		 }
	}

	@Override
	public boolean upd(EmployeeDetail ee) throws Exception {
		boolean value=true;
		 String sql = "update employee_details set department_id=?  where e_id=?";
		    try ( Connection connection = dbconnection.getConnection();
		    		PreparedStatement stmt=connection.prepareStatement(sql);)
		    {
		    	stmt.setInt(1, ee.getDepartmentId());
		    	stmt.setInt(2,ee.geteId());
		    stmt.executeUpdate();
		       
		    System.out.println("Update Successful");
				
	}
			catch (Exception e) {
				 {
					 e.printStackTrace();
				
				 }}
			return value;}

	

	public boolean insert(EmployeeDetail  tr) throws Exception {
		 boolean insert =true;
	    
		 String sql = "insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group) values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)";
		 System.out.println(sql);
try(   
	Connection connection = dbconnection.getConnection();
	 
	PreparedStatement st = connection.prepareStatement(sql);)

{    st.setString(1, tr.getEmployeeName());
     st.setString(2, tr.getGender());
     Date mm =Date.valueOf(tr.getBirthDate());
     st.setDate(3, mm);
     Date mn =Date.valueOf(tr.getJoiningDate());
     st.setDate(4, mn);
     st.setString(5, tr.getPanCard());
     st.setLong(6, tr.getAdharNum());
     st.setLong(7,  tr.getEmployeeMobnum());
     st.setString(8, tr.getGmail());
     st.setString(9, tr.getBloodGroup());
     
     System.out.println(tr.getEmployeeName());
     System.out.println(tr.getGender());
    System.out.println(tr.getBirthDate());
     System.out.println(tr.getJoiningDate());
     System.out.println(tr.getPanCard());
     System.out.println(tr.getAdharNum());
     System.out.println(tr.getEmployeeMobnum());
     System.out.println(tr.getGmail());
     System.out.println(tr.getBloodGroup());
    int i=st.executeUpdate(); 
{
	   if(i>0)  {
    	   System.out.print("You are successfully registered..."); 
       insert=true; 
	}
	else { 
		insert =false;
	}
	 
	}}
     catch (Exception e) 
			 {
			 e.printStackTrace();
			 }
return insert;}


	@Override
	public void sel(int ch,int id) throws Exception {
		try(
				  Connection connection = dbconnection.getConnection();
			        Statement st = connection.createStatement();
			)
				{
			        if(ch==2)
			        {
			        String sql = "select * from employee_details";
			       try (ResultSet rs = st.executeQuery(sql);)
			       {
			        System.out.print("ID\t\tName\n");
			        System.out.print("--\t\t----\n\n");
			        while(rs.next()){
			            System.out.println(rs.getInt(1)+"\t\t"+rs.getString("employee_name"));
			        }
			        rs.close();
			         
			        st.close();
			
			       }
			        }
			        else if(ch == 1)
			        {
			            
			            String sql =  "select department_id,employee_name from employee_details where e_id=?";
			          
	                 
			            try(PreparedStatement k=connection.prepareStatement(sql);)
			            {
			            	  k.setInt(1,id);

			            		try(ResultSet rs = k.executeQuery();)
			            		{
			             
			            while(rs.next()){
			                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			            }
			            rs.close();
			             
			            st.close();
			           
			            
			        }}}}
					catch (Exception e) {
						 
							 e.printStackTrace();
							 }
				
						}

	@Override
	public List<addressmodel> addr(String employeeName) throws SQLException, Exception {
		
		try (Connection con1 = dbconnection.getConnection(); Statement stmt = con1.createStatement();) {
            ArrayList<addressmodel> task = new ArrayList<>();
            
            		 String sql=  "select e.e_id,e.employee_name,a.address_type,a.address_line1,a.city_name,a.pin_code from employee_details e inner join employee_addresses a on e.e_id=a.emp_id where e.employee_name='"+employeeName+"'";
               
                    System.out.println(sql);
                    

                    try (ResultSet rs = stmt.executeQuery(sql);) {

                        if(rs.next()) {
                            addressmodel a=new addressmodel();
                            a.seteId(rs.getInt("e_id"));
                            a.setEmployeeName(rs.getString("employee_name"));
                            a.setAddressType(rs.getString("address_type"));
                            a.setAddressLine1(rs.getString("address_line1"));
                            a.setCityName(rs.getString("city_name"));
                            a.setPinCode(rs.getInt("pin_code"));
                            task.add(a);
                        }
                    }
                
		
           
         catch (Exception e) {
            e.printStackTrace();
        }
		return task;
	}}}


	





	



	






    


