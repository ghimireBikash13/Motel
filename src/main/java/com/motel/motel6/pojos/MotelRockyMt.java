package com.motel.motel6.pojos;

public class MotelRockyMt {
	private String motelName;
	private String address;
	private long phoneNo;
	private String ownerName;
	private int noOfEmployee;
	
	private Room101CustomerInfo  customerinfo;
	public String getMotelName() {
		return motelName;
	}
	public void setMotelName(String motelName) {
		this.motelName = motelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	
	public Room101CustomerInfo getCustomerinfo() {
		return customerinfo;
	}
	public void setCustomerinfo(Room101CustomerInfo customerinfo) {
		this.customerinfo = customerinfo;
	}
	@Override
	public String toString() {
		return "MotelRockyMt [motelName=" + motelName + ", address=" + address + ", phoneNo=" + phoneNo + ", ownerName="
				+ ownerName + ", noOfEmployee=" + noOfEmployee + ", customerinfo=" + customerinfo + "]";
	}
	
	

}
