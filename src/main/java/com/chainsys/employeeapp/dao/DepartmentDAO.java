package com.chainsys.employeeapp.dao;

import java.util.List;

public interface DepartmentDAO {

	void addDepartment(int departmentId, String departmentName, int managerId, String departmentlocation)
			throws Exception;

	List<String> empdept() throws Exception;

	void deptadd(String deptName, int deptId) throws Exception;

}
