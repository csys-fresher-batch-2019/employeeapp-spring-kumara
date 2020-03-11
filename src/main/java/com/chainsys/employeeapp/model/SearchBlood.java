package com.chainsys.employeeapp.model;

public class SearchBlood {

	private int eId;
	private int departmentId;
	private String employeeName;
	private long employeeMobnum;
	private String email;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeeMobnum() {
		return employeeMobnum;
	}

	public void setEmployeeMobnum(long employeeMobnum) {
		this.employeeMobnum = employeeMobnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "bloodmodel [eId=" + eId + ", departmentId=" + departmentId + ", employeeName=" + employeeName
				+ ", employeeMobnum=" + employeeMobnum + ", email=" + email + "]";
	}

}
