package com.employee.model;



public class incrementmodel {
	
	 private  int eId; 
	 private int departmentId;
	 private int oldSalary;
	 private int newSalary;
	 private String  employeeName;
		private int noofyear;
		private float increment;
	
	public float getIncrement() {
			return increment;
		}
		public void setIncrement(float increment) {
			this.increment = increment;
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
	public int getOldSalary() {
		return oldSalary;
	}
	public void setOldSalary(int oldSalary) {
		this.oldSalary = oldSalary;
	}
	public int getNewSalary() {
		return newSalary;
	}
	public void setNewSalary(int newSalary) {
		this.newSalary = newSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getNoofyear() {
		return noofyear;
	}
	public void setNoofyear(int noofyear) {
		this.noofyear = noofyear;
	}
	
	 @Override
	public String toString() {
		return "incrementmodel [eId=" + eId + ", departmentId=" + departmentId + ", oldSalary=" + oldSalary
				+ ", newSalary=" + newSalary + ", employeeName=" + employeeName + ", noofyear=" + noofyear
				+ ", increment=" + increment + "]";
	}

}
