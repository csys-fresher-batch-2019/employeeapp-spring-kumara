package com.chainsys.employeeapp.dao;

public interface DepartmentDAO {

void insertdeptment(int departmentId, String departmentName, int managerId,String departmentlocation) throws Exception;

void deptadd(String deptName,int deptId) throws Exception;

int getNoOfdept(String departmentLocation) throws Exception;



}


