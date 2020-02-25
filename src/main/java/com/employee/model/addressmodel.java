package com.employee.model;

public class addressmodel {
	private  int eId;    
 
    private String  employeeName;
    private String AddressType;
    private String AddressLine1;
    private String CityName;
    private int pinCode;
	@Override
	public String toString() {
		return "addressmodel [eId=" + eId + ", employeeName=" + employeeName + ", AddressType=" + AddressType
				+ ", AddressLine1=" + AddressLine1 + ", CityName=" + CityName + ", pinCode=" + pinCode + "]";
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
    

}
