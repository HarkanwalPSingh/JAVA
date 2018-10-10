package com.cg.payroll.daoServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.util.ConnectionProvider;

public class AssociateDAOImpl implements AssociateDAO {
	private Connection conn = ConnectionProvider.getDBConnectionProvider();
	static int ASSOCIATE_ID_COUNTER = 101;
	public static void displayCounter(){
		System.out.println(ASSOCIATE_ID_COUNTER);
	}
	@Override
	public Associate save(Associate associate) throws SQLException {
		try {
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("Insert into associate1(yearlyInvestmentUnder80C,firstName, lastName, department, designation, pancard,emailId) values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, associate.getYearlyInvestmentUnder80C());
			pstmt.setString(2, associate.getFirstName());
			pstmt.setString(3, associate.getLastName());
			pstmt.setString(4, associate.getDepartment());
			pstmt.setString(5, associate.getDepartment());
			pstmt.setString(6, associate.getPancard());
			pstmt.setString(7, associate.getEmailId());
			pstmt.executeUpdate();
			
			PreparedStatement pstmt1= conn.prepareStatement("SELECT MAX(ASSOCIATEID) FROM associate1");
			ResultSet rs = pstmt1.executeQuery();
			rs.next();
			int associateId = rs.getInt(1);
			
			PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO salary1(basicSalary, epf, companyPf,associateid) VALUES (?,?,?,?)");
			pstmt2.setInt(1, associate.getSalary().getBasicSalary());
			pstmt2.setInt(2, associate.getSalary().getEpf());
			pstmt2.setInt(3, associate.getSalary().getCompanyPf());
			pstmt2.setInt(4, associateId);
			pstmt2.executeUpdate();
			
			PreparedStatement pstmt3 = conn.prepareStatement("INSERT INTO bankdetails1(accountNumber, bankName, ifscCode,associateid) VALUES (?,?,?,?)");
			pstmt3.setInt(1, associate.getBankdetails().getAccountnumber());
			pstmt3.setString(2, associate.getBankdetails().getBankName());
			pstmt3.setString(3, associate.getBankdetails().getIfscCode());
			pstmt3.setInt(4, associateId);
			pstmt3.executeUpdate();
			
			conn.commit();
			associate.setAssociateID(associateId);
			return associate;
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
			throw e;
		}
		finally{
			conn.setAutoCommit(true);
		}
	}

	@Override
	public Associate findOne(int associateId){
		
		try {
			PreparedStatement pstmt1;
			pstmt1 = conn.prepareStatement("SELECT * FROM associate1 WHERE associateID =" + associateId);
			ResultSet associateRS = pstmt1.executeQuery();
			Associate associate;
			if(associateRS.next()){
				String firstName = associateRS.getString("firstName");
				String lastName = associateRS.getString("lastName");
				String emailId = associateRS.getString("emailId");
				String department = associateRS.getString("department");
				String designation = associateRS.getString("designation");
				String pancard = associateRS.getString("pancard");
				int yearlyInvestmentUnder80C = associateRS.getInt("yearlyInvestmentUnder80C");
				associate=new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, null, null);
				PreparedStatement pstmt2 = conn.prepareStatement("SELECT * FROM bankdetails WHERE associateID ="+associateId);
				ResultSet bankDetailsRS = pstmt2.executeQuery();
				if(bankDetailsRS.next()){
					int accountNumber= bankDetailsRS.getInt("accountNumber");
					String bankName=bankDetailsRS.getString("bankName");
					String ifscCode=bankDetailsRS.getString("ifscCode");
					associate.setBankdetails(new BankDetails(accountNumber, bankName, ifscCode));	
				}
				
//				BankDetails bankDetails = new BankDetails(bankDetailsRS.getInt("accountnumber"), bankDetailsRS.getString("bankName"), bankDetailsRS.getString("ifscCode"));					
//				BankDetails bankDetails = new BankDetails(accountNumber, bankName, ifscCode);	
				PreparedStatement pstmt3 = conn.prepareStatement("SELECT * FROM salary WHERE associateID ="+ associateId);
				ResultSet salaryRS = pstmt3.executeQuery();
				if(salaryRS.next()){
					associate.setSalary(new Salary(salaryRS.getInt("basicSalary"), salaryRS.getInt("epf"), salaryRS.getInt("companyPf")));
					associate.setAssociateID(associateId);
				}
//				Salary salary = new Salary(salaryRS.getInt("basicSalary"), salaryRS.getInt("epf"), salaryRS.getInt("companyPf"));		
//				Associate associate = new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, bankDetails , salary);
				return associate;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Associate> findAll() {
		return null;
	}

}
