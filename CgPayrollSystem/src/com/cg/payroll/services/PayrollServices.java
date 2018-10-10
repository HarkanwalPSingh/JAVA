package com.cg.payroll.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public interface PayrollServices {
	int acceptAssociateDetails(String firstName, String lastName,
			String emailId, String department, String designation,
			String pancard, int yearlyInvestmentUnder80C, int basicSalary,
			int epf, int companyPf, int accountNumber, String bankName,
			String ifscCode) throws PayrollServicesDownException, SQLException;

	int calculateNetSalary(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException, SQLException;

	Associate getAssociateDetails(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException, SQLException;

	ArrayList<Associate> getAllAssociateDetails()
			throws PayrollServicesDownException;
}
