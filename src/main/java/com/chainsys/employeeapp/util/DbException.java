package com.chainsys.employeeapp.util;

public class DbException extends Exception {

	public DbException(String msg) {
		super(msg);
	}

	public DbException(String msg, Exception e) {
		super(msg, e);
	}

	public DbException(Exception e) {
		super(e);
	}
}
