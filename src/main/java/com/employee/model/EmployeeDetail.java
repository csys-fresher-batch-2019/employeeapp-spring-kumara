package com.employee.model;

import java.time.LocalDate;

public class EmployeeDetail {
   
	private  int eId;    
    private int departmentId;
    private String  employeeName;
    private String gender;
    private LocalDate birthDate ;
    private LocalDate joiningDate;
    private String panCard ;
    private long adharNum ;
    private String drivingLicense_num;
    private long employeeMobnum;
    private String gmail;
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
		return panCard;
	}

	public void setPanCard(String string) {
		this.panCard = string;
	}

	public long getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}

	public String getDrivingLicense_num() {
		return drivingLicense_num;
	}

	public void setDrivingLicense_num(String drivingLicense_num) {
		this.drivingLicense_num = drivingLicense_num;
	}

	public long getEmployeeMobnum() {
		return employeeMobnum;
	}

	public void setEmployeeMobnum(long employeeMobnum) {
		this.employeeMobnum = employeeMobnum;
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
		this.panCard = panCard;
		this.adharNum = adharNum;
		this.drivingLicense_num = drivingLicense_num;
		this.employeeMobnum = employeeMobnum;
	}
	
	public void seteId1(int eId) {
		if ( eId < 0) {
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
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
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
				+ panCard + ", adharNum=" + adharNum + ", drivingLicense_num=" + drivingLicense_num
				+ ", employeeMobnum=" + employeeMobnum + ", gmail=" + gmail + ", bloodGroup=" + bloodGroup + "]";
	}

	
	

}
		
	

