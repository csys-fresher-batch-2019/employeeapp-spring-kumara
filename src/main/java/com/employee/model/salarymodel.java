package com.employee.model;

public class salarymodel {
	 private  int eId; 
	 private int departmentId;
	 private String  employeeName;
	 private int year;
	private int AnnualSalary;
	public int getAnnualSalary() {
		return AnnualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		AnnualSalary = annualSalary;
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
				+ ", AnnualSalary=" + AnnualSalary + ", tax=" + tax + "]";
	}
}
