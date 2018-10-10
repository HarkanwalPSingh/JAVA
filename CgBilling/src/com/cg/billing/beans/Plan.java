package com.cg.billing.beans;

public class Plan {
	private String planID,freeInternetDataUsageUnits,planCircle,planName;
	private int monthlyRental,	freeLocalCalls,freeStdCalls,freeLocalSms,freeStdSms;
	private int localCallRate,stdCallRate,localSmsRate,stdSmsRate,internetDataUsageRate;
	public Plan(){
		super();
	}
	public Plan(String planID, String freeInternetDataUsageUnits,
			String planCircle, String planName, int monthlyRental,
			int freeLocalCalls, int freeStdCalls, int freeLocalSms,
			int freeStdSms, int localCallRate, int stdCallRate,
			int localSmsRate, int stdSmsRate, int internetDataUsageRate) {
		super();
		this.planID = planID;
		this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
		this.planCircle = planCircle;
		this.planName = planName;
		this.monthlyRental = monthlyRental;
		this.freeLocalCalls = freeLocalCalls;
		this.freeStdCalls = freeStdCalls;
		this.freeLocalSms = freeLocalSms;
		this.freeStdSms = freeStdSms;
		this.localCallRate = localCallRate;
		this.stdCallRate = stdCallRate;
		this.localSmsRate = localSmsRate;
		this.stdSmsRate = stdSmsRate;
		this.internetDataUsageRate = internetDataUsageRate;
	}
	public String getPlanID() {
		return planID;
	}
	public void setPlanID(String planID) {
		this.planID = planID;
	}
	public String getFreeInternetDataUsageUnits() {
		return freeInternetDataUsageUnits;
	}
	public void setFreeInternetDataUsageUnits(String freeInternetDataUsageUnits) {
		this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
	}
	public String getPlanCircle() {
		return planCircle;
	}
	public void setPlanCircle(String planCircle) {
		this.planCircle = planCircle;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getMonthlyRental() {
		return monthlyRental;
	}
	public void setMonthlyRental(int monthlyRental) {
		this.monthlyRental = monthlyRental;
	}
	public int getFreeLocalCalls() {
		return freeLocalCalls;
	}
	public void setFreeLocalCalls(int freeLocalCalls) {
		this.freeLocalCalls = freeLocalCalls;
	}
	public int getFreeStdCalls() {
		return freeStdCalls;
	}
	public void setFreeStdCalls(int freeStdCalls) {
		this.freeStdCalls = freeStdCalls;
	}
	public int getFreeLocalSms() {
		return freeLocalSms;
	}
	public void setFreeLocalSms(int freeLocalSms) {
		this.freeLocalSms = freeLocalSms;
	}
	public int getFreeStdSms() {
		return freeStdSms;
	}
	public void setFreeStdSms(int freeStdSms) {
		this.freeStdSms = freeStdSms;
	}
	public int getLocalCallRate() {
		return localCallRate;
	}
	public void setLocalCallRate(int localCallRate) {
		this.localCallRate = localCallRate;
	}
	public int getStdCallRate() {
		return stdCallRate;
	}
	public void setStdCallRate(int stdCallRate) {
		this.stdCallRate = stdCallRate;
	}
	public int getLocalSmsRate() {
		return localSmsRate;
	}
	public void setLocalSmsRate(int localSmsRate) {
		this.localSmsRate = localSmsRate;
	}
	public int getStdSmsRate() {
		return stdSmsRate;
	}
	public void setStdSmsRate(int stdSmsRate) {
		this.stdSmsRate = stdSmsRate;
	}
	public int getInternetDataUsageRate() {
		return internetDataUsageRate;
	}
	public void setInternetDataUsageRate(int internetDataUsageRate) {
		this.internetDataUsageRate = internetDataUsageRate;
	}
	
}
