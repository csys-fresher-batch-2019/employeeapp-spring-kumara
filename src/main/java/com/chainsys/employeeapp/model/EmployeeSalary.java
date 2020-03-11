package com.chainsys.employeeapp.model;

public class EmployeeSalary {
	private int eId;
	private int departmentId;
	private String employeeName;
	private int salaryYear;
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

	public int getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(int salaryYear) {
		this.salaryYear = salaryYear;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "salarymodel [ eId=" + eId + ", departmentId=" + departmentId + ", employeeName=" + employeeName
				+ ",  year=" + salaryYear + ", AnnualSalary=" + annualSalary + ", tax=" + tax + "]";
	}
}
