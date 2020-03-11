package com.chainsys.employeeapp.model;

public class salarymodel {
	 private  int eId; 
	 private int departmentId;
	 private String  employeeName;
	 private int year;
	private int annualSalary;
	
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	private int tax;
	
	
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

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	 
	 @Override
	public String toString() {
		return "salarymodel [ eId=" + eId + ", departmentId="
				+ departmentId + ", employeeName=" + employeeName + ",  year=" + year
				+ ", AnnualSalary=" + annualSalary + ", tax=" + tax + "]";
	}
}
