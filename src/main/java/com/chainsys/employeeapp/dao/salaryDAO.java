package com.chainsys.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.chainsys.employeeapp.model.incrementmodel;
import com.chainsys.employeeapp.model.salarymodel;

public interface salaryDAO {
List<salarymodel> tax(int eId) throws SQLException, Exception;
List<incrementmodel> increment(double increment, int Noofyear) throws SQLException, Exception;;
}
