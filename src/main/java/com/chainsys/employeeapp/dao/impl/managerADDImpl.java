package com.chainsys.employeeapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainsys.employeeapp.dao.addmanagerDAO;
import com.chainsys.employeeapp.model.manager;
import com.chainsys.employeeapp.util.dbconnection;

public class managerADDImpl implements addmanagerDAO {
	private static final Logger logger = LoggerFactory.getLogger(managerADDImpl.class);

	/**
	 * Insert a new and extra Manager in managerAdd
	 */
	public boolean addmanager(manager add) throws Exception {
		boolean insert = true;
		String sql = "insert into manager(manager_name,email,dob,mob_num,pass_word,gender,manager_id) values(?,?,?,?,?,?,Update_sequence.nextval)";
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement k = connection.prepareStatement(sql);) {
			logger.debug(sql);
			k.setString(1, add.getManagerName());
			k.setString(2, add.getEmail());
			k.setDate(3, Date.valueOf(add.getDob()));
			k.setLong(4, add.getMobNum());
			k.setString(5, add.getPassWord());
			k.setString(6, add.getGender());
			int i = k.executeUpdate();
			if (i > 0) {
				logger.info("You are successfully registered...");
				insert = true;
			} else {
				insert = false;
			}
			return insert;
		}
	}

	/**
	 * To find a correct manager_userName and password to LogIN
	 */
	public boolean login(String managerName, String passWord) throws Exception {

		boolean result = false;
		String sql = "select pass_word from Manager where manager_name=?";
		String password1 = null;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement k = connection.prepareStatement(sql);) {
			k.setString(1, managerName);
			try (ResultSet rs = k.executeQuery();) {
				if (rs.next()) {
					password1 = rs.getString("pass_word");
				}
				if (password1 != null) {
					if (password1.equals(passWord)) {
						logger.info("log in");
						result = true;
					} else {
						logger.info("password Wrong");
						result = false;
					}
				} else {
					logger.info("userName wrong");
				}
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
