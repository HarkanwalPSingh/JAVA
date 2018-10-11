package com.cg.payroll.client;

import java.io.ObjectInputStream.GetField;
import java.sql.SQLException;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoServices.AssociateDAO;
import com.cg.payroll.daoServices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.ConnectionProvider;

public class MainClass {

	public static void main(String[] args)
			throws AssociateDetailsNotFoundException {

		if (ConnectionProvider.getDBConnectionProvider() != null)
			System.out.println("Successfully Connected");
		else
			System.out.println("Not Connected");

		try {
			PayrollServices payroll = new PayrollServicesImpl();
			
		/*	int associateId1 = payroll.acceptAssociateDetails("Sahil", "Singh",
					"newmann@gmail.com", "Java", "A.Con", "ASDF123123", 5000,
					50000, 1000, 2000, 123546798, "HDFC", "HDFC00001");			
		*/	// System.out.println(associateId1);
					int associateId = payroll.acceptAssociateDetails("Sahil", "Singh",
					"hkps@gmail.com", "JavaFullStack", "A.Con", "ASDF123",
					8000, 60000, 2000, 1000, 123456789, "Axis", "AXIS000002");
//			System.out.println(associateId1);
			
				
			 
				payroll.calculateNetSalary(associateId);
				System.out.println(payroll.getAssociateDetails(associateId));
			
			 
		} catch (PayrollServicesDownException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*
		 * BankDetails bankDetails1 = new BankDetails(456798132, "HDFC",
		 * "HDFC00005"); BankDetails bankDetails2 = new BankDetails(963258147,
		 * "Axis", "AXIS000002"); BankDetails bankDetails3 = new
		 * BankDetails(741258339, "ICICI", "ICIC000012");
		 * 
		 * Salary salary1 = new Salary(50000, 12000, 2000, 2000, 5000, 5000,
		 * 1000, 1000, 3000, 65000, 55000); Salary salary2 = new Salary(60000,
		 * 12000, 2000, 2000, 5000, 5000, 1000, 1000, 3000, 70000, 60000);
		 * Salary salary3 = new Salary(70000, 14000, 2000, 2000, 5000, 5000,
		 * 1000, 1000, 3000, 90000, 65000);
		 * 
		 * Associate associate1 = new
		 * Associate(101,45000,"Suresh","Kumar","Java"
		 * ,"consultant","RGTW1234","suresh@gmail.com",bankDetails1,salary1);
		 * Associate associate2 = new
		 * Associate(102,50000,"Duresh","Kumar","java"
		 * ,"as.consultant","RGQW2234","duresh@gmail.com",bankDetails2,salary2);
		 * Associate associate3 = new
		 * Associate(103,65000,"Muresh","Kumar",".net"
		 * ,"sr.consultant","FQW2234","muresh@gmail.com",bankDetails3,salary3);
		 * 
		 * associate1.getSalary().setHra((20*associate1.getSalary().getBasicSalary
		 * ())/100);
		 * associate1.getSalary().setOtherAllowance(30*associate1.getSalary
		 * ().getBasicSalary()/100);
		 * associate1.getSalary().setPersonalAllowance(
		 * 20*associate1.getSalary().getBasicSalary()/100);
		 * associate1.getSalary(
		 * ).setConveyanceAllowance(10*associate1.getSalary(
		 * ).getBasicSalary()/100);
		 * associate1.getSalary().setGrossSalary(associate1
		 * .getSalary().getBasicSalary
		 * ()+associate1.getSalary().getHra()+associate1
		 * .getSalary().getPersonalAllowance
		 * ()+associate1.getSalary().getOtherAllowance
		 * ()+associate1.getSalary().getConveyanceAllowance());
		 * 
		 * System.out.println(associate1.getSalary().getGrossSalary());
		 */

	}

}
