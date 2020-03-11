package com.chainsys.employeeapp.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDetail {
	private int eId;
	private int departmentId;
	private String employeeName;
	private String gender;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate birthDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate joiningDate;

	private String pancard;
	private long adharNumber;
	private String drivingLicenseNum;
	private long employeeMobNum;
	private String email;
	private String bloodGroup;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate dateOfBirth) {
		this.birthDate = dateOfBirth;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPanCard() {
		return pancard;
	}

	public void setPanCard(String string) {
		this.pancard = string;
	}

	public long getAdharNum() {
		return adharNumber;
	}

	public void setAdharNum(long adharNum) {
		this.adharNumber = adharNum;
	}

	public String getDrivingLicensenum() {
		return drivingLicenseNum;
	}

	public void setDrivingLicensenum(String drivingLicensenum) {
		this.drivingLicenseNum = drivingLicensenum;
	}

	public long getEmployeeMobNum() {
		return employeeMobNum;
	}

	public void setEmployeeMobnum(long employeeMobNum) {
		this.employeeMobNum = employeeMobNum;
	}

	public EmployeeDetail() {

	}

	public EmployeeDetail(int eId, int departmentId, String employeeName, String gender, LocalDate birthDate,
			LocalDate joiningDate, String panCard, long adharNum, String drivingLicense_num, long employeeMobnum) {
		super();
		this.seteId1(eId);
		this.departmentId = departmentId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.joiningDate = joiningDate;
		this.pancard = panCard;
		this.adharNumber = adharNum;
		this.drivingLicenseNum = drivingLicense_num;
		this.employeeMobNum = employeeMobnum;
	}

	public void seteId1(int eId) {
		if (eId < 0) {
			throw new IllegalArgumentException("Invalid Eid");
		}
		this.seteId1(eId);
	}

	public int getId() {
		return geteId();
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public void save(EmployeeDetail employeeDetail) {
		// TODO Auto-generated method stub

	}

	public void getInput() {
		// TODO Auto-generated method stub

	}

	public void display() {
		// TODO Auto-generated method stub

	}

	public String getGmail() {
		return email;
	}

	public void setGmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [eId=" + eId + ", departmentId=" + departmentId + ", employeeName=" + employeeName
				+ ", gender=" + gender + ", birthDate=" + birthDate + ", joiningDate=" + joiningDate + ", panCard="
				+ pancard + ", adharNum=" + adharNumber + ", drivingLicense_num=" + drivingLicenseNum
				+ ", employeeMobnum=" + employeeMobNum + ", gmail=" + email + ", bloodGroup=" + bloodGroup + "]";
	}

}
