package com.employee.model;

import java.sql.Date;

public class addman {
	private int managerId;
	private String managerName;
	private String Email;
	private Date dob;
	private Long mobNum;
	private String passWord;
	private String Gender;
	
	

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



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public Long getMobNum() {
		return mobNum;
	}



	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	@Override
	public String toString() {
		return "addman [managerId=" + managerId + ", managerName=" + managerName + ", Email=" + Email + ", dob=" + dob
				+ ", mobNum=" + mobNum + ", passWord=" + passWord + ", Gender=" + Gender + "]";
	}
	

}
