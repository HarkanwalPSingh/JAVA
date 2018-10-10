package com.cg.banking.beans;

public class Address {
	private String city,country,state;
	private int pinCode;
	public Address(){
		super();
	}
	public Address(String city, String country, String state, int pinCode) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
