package com.cg.project.enumdemo;

public enum Month {
	
	JAN(1,"January"),
	FEB(2,"February"),
	MAR(3,"March"),
	APR(4,"April"),
	MAY(5,"May"),
	JUN(6,"June"),
	JULY(7,"July"),
	AUG(8,"August"),
	SEP(9,"September"),
	OCT(10,"October"),
	NOV(11,"November"),
	DEC(12,"December");
	
	private int monthIndex;
	private String monthName;
	
	private Month(int monthIndex, String monthName) {
		this.monthIndex = monthIndex;
		this.monthName = monthName;
	}
	public int getMonthIndex() {
		return monthIndex;
	}

	public String getMonthName() {
		return monthName;
	}
}
