package com.cg.payroll.beans;

public class Associate {

	public Associate(int yearlyInvestmentUnder80C, String firstName,
			String lastName, String department, String designation,
			String pancard, String emailId, BankDetails bankdetails,
			Salary salary) {
		super();
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}

	private int associateID, yearlyInvestmentUnder80C;
	private String firstName, lastName, department, designation, pancard,
			emailId;

	private BankDetails bankdetails = new BankDetails();
	private Salary salary = new Salary();

	public BankDetails getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	private static int ASSOCIATE_COUNTER;
	static {
		ASSOCIATE_COUNTER = 123;
	}

	public static int getASSOCIATE_COUNTER() {
		return ASSOCIATE_COUNTER;
	}

	@Override
	public String toString() {
		return "Associate [associateID=" + associateID
				+ ", yearlyInvestmentUnder80C=" + yearlyInvestmentUnder80C
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", designation=" + designation
				+ ", pancard=" + pancard + ", emailId=" + emailId
				+ ", bankdetails=" + bankdetails + ", salary=" + salary + "]";
	}

	public Associate(int associateID, int yearlyInvestmentUnder80C,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailId,
			BankDetails bankdetails, Salary salary) {
		super();
		this.bankdetails = bankdetails;
		this.salary = salary;
		this.associateID = associateID;
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
	}
	

	public int getAssociateID() {
		return associateID;
	}

	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}

	public int getYearlyInvestmentUnder80C() {
		return yearlyInvestmentUnder80C;
	}

	public void setYearlyInvestmentUnder80C(int yearlyInvestmentUnder80C) {
		this.yearlyInvestmentUnder80C = yearlyInvestmentUnder80C;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
