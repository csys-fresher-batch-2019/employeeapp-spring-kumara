package com.employee.model;

public class DeptModel {
	private int dId;

private String departmentName;
 private int managerId;
 private String departmentLocation;
 
 
 
 public int getdId() {
	return dId;
}


public void setdId(int dId) {
	this.dId = dId;
}


public String getDepartmentName() {
	return departmentName;
}


public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}


public int getManagerId() {
	return managerId;
}


public void setManagerId(int managerId) {
	this.managerId = managerId;
}


public String getDepartmentLocation() {
	return departmentLocation;
}


public void setDepartmentLocation(String departmentLocation) {
	this.departmentLocation = departmentLocation;
}


@Override
	public String toString() {
		return "class1 [dId=" + dId + ", departmentName=" + departmentName + ", managerId=" + managerId
				+ ", departmentLocation=" + departmentLocation + "]";
	}


public DeptModel() {
	super();
	this.dId = dId;
	this.departmentName = departmentName;
	this.managerId = managerId;
	this.departmentLocation = departmentLocation;
}
}



