package com.cg.banking.beans;

public class Transaction {
	private int transactionID,amount;
	private String timeStamp,transactionType,transactionLocation,modeOfTransaction,transactionStatus;
	public Transaction(){
		super();
	}
	public Transaction(int transactionID, int amount, String timeStamp,
			String transactionType, String transactionLocation,
			String modeOfTransaction, String transactionStatus) {
		super();
		this.transactionID = transactionID;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.transactionType = transactionType;
		this.transactionLocation = transactionLocation;
		this.modeOfTransaction = modeOfTransaction;
		this.transactionStatus = transactionStatus;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionLocation() {
		return transactionLocation;
	}
	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
}
