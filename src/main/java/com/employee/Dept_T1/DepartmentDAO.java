package com.employee.Dept_T1;

public interface DepartmentDAO {

void inserdept(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception;

void deptadd(String deptName,int deptId) throws Exception;

int getNoOfdept(String departmentLocation) throws Exception;



}


