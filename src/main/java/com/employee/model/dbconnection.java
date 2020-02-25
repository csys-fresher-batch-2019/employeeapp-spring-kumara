package com.employee.model;

import java.sql.Connection;
import java.sql.DriverManager;


//import java.sql.SQLException;
//import java.sql.Statement;

public class dbconnection {

	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@13.235.147.120:1521:XE", "kumarakkani", "kumarakkani");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		// Statement stmt=con.createStatement();
		return con;

	}
/*
	public static Jdbi getJdbi() {
		Connection connection;
		Jdbi jdbi = null;
		try {
			connection = dbconnection.getConnection();

			jdbi = Jdbi.create(connection);
			jdbi.installPlugin(new SqlObjectPlugin());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return jdbi;
	}*/
}