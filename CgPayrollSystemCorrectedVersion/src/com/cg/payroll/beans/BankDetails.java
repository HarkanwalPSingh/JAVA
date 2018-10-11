package com.cg.payroll.beans;

public class BankDetails {
	private int accountnumber ;
	private String bankName ,ifscCode;
	public BankDetails(){
		super();
	}
	
	@Override
	public String toString() {
		return "BankDetails [accountnumber=" + accountnumber + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ "]";
	}

	public BankDetails(int accountnumber, String bankName, String ifscCode) {
		super();
		this.accountnumber = accountnumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
}
