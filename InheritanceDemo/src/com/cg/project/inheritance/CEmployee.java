package com.cg.project.inheritance;

public final class CEmployee extends Employee{
	@Override
	public void TotalSalary() {
		setTotalSalary(getBasicSalary()+varSalary);
	}
	@Override
	public String toString() {
		return super.toString()+" varSalary=" + varSalary + ", noOfHours=" + noOfHours
				+ "]";
	}
	public int getVarSalary() {
		return varSalary;
	}
	public void setVarSalary(int varSalary) {
		this.varSalary = varSalary;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public CEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary, int varSalary, int noOfHours) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
		this.varSalary = varSalary;
		this.noOfHours = noOfHours;
	}
	public CEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
	}
	
	private int varSalary, noOfHours;
	private CEmployee(){
		super();
	}
		

}
