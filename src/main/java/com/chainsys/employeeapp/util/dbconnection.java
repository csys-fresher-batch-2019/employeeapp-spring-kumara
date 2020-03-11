package com.chainsys.employeeapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {

	public static Connection getConnection() throws DbException, ClassNotFoundException {
		// TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		// TimeZone.setDefault(timeZone);
		// Class.forName("oracle.jdbc.driver.OracleDriver");

		// Connection con =
		// DriverManager.getConnection("jdbc:oracle:thin:@13.235.147.120:1521:XE",
		// "kumarakkani", "kumarakkani");
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException("", e);
		}
		// Statement stmt=con.createStatement();
		return con;

	}

}