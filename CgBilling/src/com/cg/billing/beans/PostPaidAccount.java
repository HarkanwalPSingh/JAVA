package com.cg.billing.beans;

public class PostPaidAccount {
	private int mobileNumber;
	public PostPaidAccount(){
		super();
	}
	public PostPaidAccount(int mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
