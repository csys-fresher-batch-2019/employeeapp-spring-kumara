package com.chainsys.employeeapp.model;

public class addressmodel {
	private  int eId;    
    private String  employeeName;
    private String addressType;
    private String addressLine;
    private String cityName;
    private int pincode;
	@Override
	public String toString() {
		return "addressmodel [eId=" + eId + ", employeeName=" + employeeName + ", AddressType=" + addressType
				+ ", AddressLine1=" + addressLine + ", CityName=" + cityName + ", pinCode=" + pincode + "]";
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
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressLine1() {
		return addressLine;
	}
	public void setAddressLine1(String addressLine1) {
		addressLine = addressLine1;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pincode;
	}
	public void setPinCode(int pinCode) {
		this.pincode = pinCode;
	}
    

}
