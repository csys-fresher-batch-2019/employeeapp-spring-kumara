package com.chainsys.employeeapp.model;

import java.time.LocalDate;

public class manager {
	private int managerId;
	private String managerName;
	private String Email;
	private LocalDate dob;
	private Long mobNum;
	private String password;
	private String gender;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getMobNum() {
		return mobNum;
	}

	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "addman [managerId=" + managerId + ", managerName=" + managerName + ", Email=" + Email + ", dob=" + dob
				+ ", mobNum=" + mobNum + ", passWord=" + password + ", Gender=" + gender + "]";
	}

}
