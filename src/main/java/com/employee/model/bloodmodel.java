package com.employee.model;

import java.util.ArrayList;

public class bloodmodel {
	private  int eId;    
    private int departmentId;
    private String  employeeName;
    private long employeeMobnum;
    private String gmail;
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "bloodmodel [eId=" + eId + ", departmentId=" + departmentId + ", employeeName=" + employeeName
				+ ", employeeMobnum=" + employeeMobnum + ", gmail=" + gmail + "]";
	}
	
	

}
