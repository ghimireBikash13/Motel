package com.motel.motel6.pojos;

public class Room101CustomerInfo {
	private String name;
	private String address;
	private String phoneNo;
	private int noOfCustomer;
	private String bookingType;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getNoOfCustomer() {
		return noOfCustomer;
	}
	public void setNoOfCustomer(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	@Override
	public String toString() {
		return "Room101CustomerInfo [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", noOfCustomer="
				+ noOfCustomer + ", bookingType=" + bookingType + "]";
	}
	
	

}
