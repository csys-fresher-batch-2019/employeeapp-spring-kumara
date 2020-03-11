package com.chainsys.employeeapp.model;

public class EmpNameDepartment {

	private String departmentName;
	private String departmentLocation;
	private int eId;
	private int departmentId;
	private String employeeName;

	@Override
	public String toString() {
		return "Empdept [departmentName=" + departmentName + ", departmentLocation=" + departmentLocation + ", eId="
				+ eId + ", departmentId=" + departmentId + ", employeeName=" + employeeName + "]";
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

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

}
