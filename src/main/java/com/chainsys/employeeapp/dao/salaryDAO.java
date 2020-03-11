package com.chainsys.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.chainsys.employeeapp.model.SalaryIncrement;
import com.chainsys.employeeapp.model.EmployeeSalary;

public interface salaryDAO {
List<EmployeeSalary> tax(int eId) throws SQLException, Exception;
List<SalaryIncrement> increment(double increment, int Noofyear) throws SQLException, Exception;;
}
