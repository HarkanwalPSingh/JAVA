package com.cg.billing.beans;

public class Customer {
	public Customer(Address address) {
		super();
		this.address = address;
	}
	private int customerID,mobileNumber,aadharNo ; 
	private String firstName,lastName,emailID,panCardNo,dateOfBirth;
	private Address address = new Address();
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(){
		super();
	}
	public Customer(int customerID, int mobileNumber, int aadharNo,
			String firstName, String lastName, String emailID,
			String panCardNo, String dateOfBirth) {
		super();
		this.customerID = customerID;
		this.mobileNumber = mobileNumber;
		this.aadharNo = aadharNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.panCardNo = panCardNo;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
