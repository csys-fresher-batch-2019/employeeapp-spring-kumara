package com.employee.salary_t3;

import java.sql.SQLException;
import java.util.List;

import com.employee.model.incrementmodel;
import com.employee.model.salarymodel;

public interface salaryDAO {
List<salarymodel> tax(int eId) throws SQLException, Exception;
List<incrementmodel> increment(double increment, int Noofyear) throws SQLException, Exception;;
}
