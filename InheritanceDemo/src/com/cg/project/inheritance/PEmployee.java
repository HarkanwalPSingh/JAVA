package com.cg.project.inheritance;

public class PEmployee extends Employee {
	
	
	public PEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
		// TODO Auto-generated constructor stub
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	
	private int hra, ta, da;
	
	public PEmployee(){
		super();
	}
	
	public void TotalSalary(){
		this.setTotalSalary(getBasicSalary()+ta+da+hra) ;
	}
}
