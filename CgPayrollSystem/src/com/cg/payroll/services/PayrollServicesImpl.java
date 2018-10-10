package com.cg.payroll.services;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoServices.AssociateDAO;
import com.cg.payroll.daoServices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public class PayrollServicesImpl implements PayrollServices {
	private AssociateDAO associateDAO = new AssociateDAOImpl();
	private static final Logger logger = Logger.getLogger(PayrollServicesImpl.class);
	@Override
	public int acceptAssociateDetails(String firstName, String lastName,
			String emailId, String department, String designation,
			String pancard, int yearlyInvestementUnder80C, int basicSalary,
			int epf, int companyPf, int accountNumber, String bankName,
			String ifscCode) throws PayrollServicesDownException{
		Associate associate = new Associate(yearlyInvestementUnder80C,
				firstName, lastName, department, designation, pancard, emailId,
				new BankDetails(accountNumber, bankName, ifscCode), new Salary(
						basicSalary, epf, companyPf));
//		System.out.println(associate);
		 try {
			associate=associateDAO.save(associate);
			return associate.getAssociateID();
		} catch (SQLException e) {
			logger.error(e.getMessage()+" "+e.getCause()+" "+e.getErrorCode());
			e.printStackTrace();
		}
		 return associate.getAssociateID();
	}

	@Override
	public int calculateNetSalary(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException, SQLException {
		Associate associate = associateDAO.findOne(associateId);
		if (associate == null)
			throw new AssociateDetailsNotFoundException(
					"Associate Details Not Found");

		// tax calculation code
		int basicSalary = associate.getSalary().getBasicSalary();

		int hra = 30 * basicSalary / 100;
		associate.getSalary().setHra(hra);

		int conveyenceAllowance = 25 * basicSalary / 100;
		associate.getSalary().setConveyanceAllowance(conveyenceAllowance);

		int otherAllowance = 25 * basicSalary / 100;
		associate.getSalary().setOtherAllowance(otherAllowance);

		int personalAllowance = 30 * basicSalary / 100;
		associate.getSalary().setPersonalAllowance(personalAllowance);

		int epf = 12 * basicSalary / 100;
		associate.getSalary().setEpf(epf);

		int companyPf = 12 * basicSalary / 100;
		associate.getSalary().setCompanyPf(companyPf);

		int gratuity = 5 * basicSalary / 100;
		associate.getSalary().setGratuity(gratuity);

		int grossSalary = basicSalary + conveyenceAllowance + otherAllowance
				+ personalAllowance + epf;
		associate.getSalary().setGrossSalary(grossSalary);
		int yearlyInvestmentUnder80C = epf
				+ associate.getYearlyInvestmentUnder80C();
		if (yearlyInvestmentUnder80C > 150000)
			yearlyInvestmentUnder80C = 150000;
		associate.setYearlyInvestmentUnder80C(yearlyInvestmentUnder80C);

		int taxableIncome = 12 * (grossSalary - epf) - yearlyInvestmentUnder80C;
		int yearlyTax = 0;
		if (taxableIncome <= 250000)
			yearlyTax = 0;
		else if (taxableIncome > 250000 && taxableIncome <= 500000)
			yearlyTax = 5 * (taxableIncome - 250000) / 100;
		else if (taxableIncome > 500000 && taxableIncome <= 1000000)
			yearlyTax = 12500 + 20 * (taxableIncome - 500000);
		else
			yearlyTax = 112500 + 30 * (taxableIncome - 1000000);
		int monthlyTax = yearlyTax / 12;
		associate.getSalary().setMonthlyTax(monthlyTax);

		int netSalary = grossSalary - epf - monthlyTax;
		associate.getSalary().setNetSalary(netSalary);

		return netSalary;
	}

	@Override
	public Associate getAssociateDetails(int associateId)
			throws AssociateDetailsNotFoundException,
			PayrollServicesDownException, SQLException {
		try {
			Associate associate;
			associate = associateDAO.findOne(associateId);
			if (associate == null)
				throw new AssociateDetailsNotFoundException(
						"Associate Details Not Found");
			return associate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Associate> getAllAssociateDetails()
			throws PayrollServicesDownException {
		return associateDAO.findAll();
	}
}
