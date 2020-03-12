package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainsys.employeeapp.controller.loggerutil;
import com.chainsys.employeeapp.dao.empdetailsDAO;
import com.chainsys.employeeapp.model.EmpNameDepartment;
import com.chainsys.employeeapp.model.EmployeeAddress;
import com.chainsys.employeeapp.model.EmployeeDetail;
import com.chainsys.employeeapp.util.DbException;
import com.chainsys.employeeapp.util.dbconnection;

public class empdetailsDAOImpl implements empdetailsDAO {
	private static final Logger logger = LoggerFactory.getLogger(loggerutil.class);

	public List<EmployeeDetail> showempDetails() throws Exception {
		List<EmployeeDetail> ne = new ArrayList<>();
		String sql = "select * from employee_details";
		try (Connection con = dbconnection.getConnection();
				Statement k = con.createStatement();
				ResultSet rs = k.executeQuery(sql);) {
			while (rs.next()) {
				EmployeeDetail emp = new EmployeeDetail();
				emp.seteId(rs.getInt("e_id"));
				emp.setEmployeeName(rs.getString("employee_name"));
				emp.setGender(rs.getString("gender"));
				emp.setBirthDate(rs.getDate("birth_date").toLocalDate());

				emp.setJoiningDate(rs.getDate("joining_date").toLocalDate());
				emp.setPanCard(rs.getString("pan_card"));
				emp.setGmail(rs.getString("gmail"));
				emp.setBloodGroup(rs.getString("blood_group"));
				ne.add(emp);
			}
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
		return ne;
	}

	public void jdate(String joiningDate, int empId) throws Exception {
		// String joiningDate = "2019-04-12";
		// int empId = 2;
		LocalDate kt = LocalDate.parse(joiningDate);
		logger.debug("", kt);
		Date kt1 = Date.valueOf(kt);
		String sql = "update employee_details set joining_date=? where e_id=? ";
		try (Connection con = dbconnection.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setDate(1, kt1);
			stmt.setInt(2, empId);
			logger.debug(sql);
			int rows = stmt.executeUpdate();
			logger.info("", rows);
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
	}

	public List<String> deptcount() throws Exception {
		String sql = "select department_id,department_name,count(employee_name) as emp_count from departments  inner join employee_details  on departments.d_id=employee_details.department_id  group by department_id,department_name order by department_id asc";
		try (Connection con = dbconnection.getConnection();
				Statement k = con.createStatement();
				ResultSet rs = k.executeQuery(sql);) {
			logger.debug(sql);
			if (rs.next()) {
				String departmentName = rs.getString("department_name");
				String employeeName = rs.getString("department_id");
				int employeeName2 = rs.getInt("emp_count");
				logger.debug(employeeName + "," + departmentName + "," + employeeName2 + "");
			}
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
		return null;
	}

	public ArrayList<EmpNameDepartment> empdet(int dId) throws Exception {
		ArrayList<EmpNameDepartment> list = new ArrayList<>();
		String sql = "select e_id,department_id,employee_name, department_name,department_location from departments d inner join employee_details e on d.d_id=e.department_id where d.d_id=?";
		try (Connection con = dbconnection.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, dId);
			try (ResultSet rs = stmt.executeQuery();) {
				while (rs.next()) {
					EmpNameDepartment emp = new EmpNameDepartment();
					emp.seteId(rs.getInt("e_id"));
					emp.setDepartmentId(rs.getInt("department_id"));
					emp.setEmployeeName(rs.getString("employee_name"));
					emp.setDepartmentName(rs.getString("department_name"));
					emp.setDepartmentLocation(rs.getString("department_location"));
					list.add(emp);
				}
			} catch (SQLException e) {
				{
					e.printStackTrace();
					throw new DbException(e);
				}
			}
			return list;
		}
	}

	public void deleteEmployeeByEmpId(int eId) throws Exception {
		String sql = "delete from employee_Details where e_id=?";
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement st = connection.prepareStatement(sql);) {
			st.setInt(1, eId);
			logger.debug(sql);
			st.executeUpdate();
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
	}

	@Override
	public boolean updateEmpDept(EmployeeDetail ee) throws Exception {
		boolean value = false;
		String sql = "update employee_details set department_id=?  where e_id=?";
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);) {
			stmt.setInt(1, ee.getDepartmentId());
			stmt.setInt(2, ee.geteId());
			stmt.executeUpdate();
			value = true;
			logger.info("Update Successful");
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
		return value;
	}

	public boolean insert(EmployeeDetail tr) throws Exception {
		boolean insert = true;
		String sql = "insert into employee_details (e_id,employee_name,gender,birth_date,joining_date,pan_card,adhar_num,employee_mobnum,gmail,blood_group) values(employee_adds.nextval,?,?,?,?,?,?,?,?,?)";
		logger.debug(sql);
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement st = connection.prepareStatement(sql);) {
			st.setString(1, tr.getEmployeeName());
			st.setString(2, tr.getGender());
			Date mm = Date.valueOf(tr.getBirthDate());
			st.setDate(3, mm);
			Date mn = Date.valueOf(tr.getJoiningDate());
			st.setDate(4, mn);
			st.setString(5, tr.getPanCard());
			st.setLong(6, tr.getAdharNum());
			st.setLong(7, tr.getEmployeeMobNum());
			st.setString(8, tr.getGmail());
			st.setString(9, tr.getBloodGroup());
			int i = st.executeUpdate();
			{
				if (i > 0) {
					System.out.print("You are successfully registered...");
					insert = true;
				} else {
					insert = false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);

		}
		return insert;
	}

	/*
	 * @Override public void selectAllEmployee(int ch, int id) throws Exception {
	 * try (Connection connection = dbconnection.getConnection(); Statement st =
	 * connection.createStatement();) { if (ch == 2) { String sql =
	 * "select * from employee_details"; try (ResultSet rs = st.executeQuery(sql);)
	 * { logger.debug("ID\t\tName\n"); logger.debug("--\t\t----\n\n"); while
	 * (rs.next()) { logger.debug(rs.getInt(1) + "\t\t" +
	 * rs.getString("employee_name")); } } } else if (ch == 1) { String sql =
	 * "select department_id,employee_name from employee_details where e_id=?"; try
	 * (PreparedStatement k = connection.prepareStatement(sql);) { k.setInt(1, id);
	 * try (ResultSet rs = k.executeQuery();) { while (rs.next()) {
	 * logger.debug(rs.getInt(1) + "\t" + rs.getString(2)); } } } } } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */

	@Override
	public List<EmployeeAddress> FindAllEmpAddress(String employeeName) throws SQLException, Exception {
		String sql = "select e.e_id,e.employee_name,a.address_type,a.address_line1,a.city_name,a.pin_code from employee_details e inner join employee_addresses a on e.e_id=a.emp_id where e.employee_name=?";
		try (Connection con1 = dbconnection.getConnection(); PreparedStatement stmt = con1.prepareStatement(sql);) {
			ArrayList<EmployeeAddress> task = new ArrayList<>();
			stmt.setString(1, employeeName);
			logger.debug(sql);
			try (ResultSet rs = stmt.executeQuery();) {
				while (rs.next()) {
					EmployeeAddress a = new EmployeeAddress();
					a.seteId(rs.getInt("e_id"));
					a.setEmployeeName(rs.getString("employee_name"));
					a.setAddressType(rs.getString("address_type"));
					a.setAddressLine(rs.getString("address_line1"));
					a.setCityName(rs.getString("city_name"));
					a.setPinCode(rs.getInt("pin_code"));
					task.add(a);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DbException(e);
			}
			return task;
		}
	}

	public boolean validateEmpID(int eID) {
		String sql = "select e_id from employee_details where e_id=?";
		boolean result = false;
		try (Connection con1 = dbconnection.getConnection(); PreparedStatement stmt = con1.prepareStatement(sql);) {
			stmt.setInt(1, eID);
			try (ResultSet rs = stmt.executeQuery();) {
				if (rs.next()) {
					result = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}