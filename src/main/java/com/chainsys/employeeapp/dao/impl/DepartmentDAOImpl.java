package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainsys.employeeapp.dao.DepartmentDAO;
import com.chainsys.employeeapp.util.DbException;
import com.chainsys.employeeapp.util.dbconnection;

public class DepartmentDAOImpl implements DepartmentDAO {
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);

	/**
	 * Used to insert a new department in departments.
	 */
	public void addDepartment(int departmentId, String departmentName, int managerId, String departmentlocation)
			throws Exception {
		String sql = "insert into departments(d_id,department_name,manager_id,department_location) values (?,?,?,?)";
		try (Connection con = dbconnection.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, departmentId);
			stmt.setString(2, departmentName);
			stmt.setInt(3, managerId);
			stmt.setString(4, departmentlocation);
			logger.debug(sql);
			int row = stmt.executeUpdate();
			logger.info("", row);
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
	}

	/**
	 * used to display departmentName in departments by using departmentLocation
	 */
	public List<String> empdept() throws Exception {
		List<String> names = new ArrayList<>();
		String sql = "(select  department_name as dept from departments where department_location is null)";

		try (Connection con = dbconnection.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			logger.debug(sql);
			while (rs.next()) {
				String deptt = rs.getString("dept");
				names.add(deptt);
				logger.debug(deptt);
			}
		} catch (SQLException e) {
			{
				e.printStackTrace();
				throw new DbException(e);
			}
		}
		return names;
	}

	/**
	 * used to update departmentName by using departmentId.
	 */
	public void deptadd(String deptName, int deptId) throws Exception {
		String sql = "update departments set department_name= ? where d_id= ?";

		try (Connection con = dbconnection.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setString(1, deptName);
			stmt.setInt(2, deptId);
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

}
