package com.cg.payroll.daoservices;
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
	private Connection conn=ConnectionProvider.getDBConnection();
	@Override
	public Associate save(Associate associate) throws SQLException {
		try {
			conn.setAutoCommit(false);
			PreparedStatement pstmt1 = conn.prepareStatement("insert into Associate(yearlyInvestmentUnder80C,firstName,lastName,department,designation,pancard,emailId) values(?,?,?,?,?,?,?)");
			pstmt1.setInt(1, associate.getYearlyInvestmentUnder80C());
			pstmt1.setString(2, associate.getFirstName());
			pstmt1.setString(3, associate.getLastName());
			pstmt1.setString(4, associate.getDepartment());
			pstmt1.setString(5, associate.getDesignation());
			pstmt1.setString(6, associate.getPancard());
			pstmt1.setString(7, associate.getEmailId());
			pstmt1.executeUpdate();
			
			PreparedStatement pstmt2 = conn.prepareStatement("select max(associateId) from Associate");
			
			ResultSet rs = pstmt2.executeQuery();
			rs.next();
			int associateId = rs.getInt(1);
			
			PreparedStatement pstmt3 = conn.prepareStatement("insert into BankDetails values(?,?,?,?)");
			pstmt3.setInt(1, associateId);
			pstmt3.setInt(2, associate.getBankDetails().getAccountNumber());
			pstmt3.setString(3, associate.getBankDetails().getBankName());
			pstmt3.setString(4, associate.getBankDetails().getIfscCode());
			
			pstmt3.executeUpdate();
			
			PreparedStatement pstmt4 = conn.prepareStatement("insert into Salary (associateId,basicSalary,epf,companypf) values(?,?,?,?)");
			pstmt4.setInt(1, associateId);
			pstmt4.setInt(2, associate.getSalary().getBasicSalary());
			pstmt4.setInt(3, associate.getSalary().getEpf());
			pstmt4.setInt(4, associate.getSalary().getCompanyPf());
			pstmt4.executeUpdate();
			conn.commit();
			associate.setAssociateID(associateId);
			return associate;
		}
		catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
			throw e;
		}
		finally {
			conn.setAutoCommit(true);
		}
	}
	@Override
	public Associate findOne(int associateId) throws SQLException {
		PreparedStatement pstmt1 = conn.prepareStatement("Select * from Associate where associateId="+associateId);
		ResultSet associateRS = pstmt1.executeQuery();
		if(associateRS.next()) {
			
			String firstName=associateRS.getString("firstName");
			String lastName=associateRS.getString("lastName");
			String department=associateRS.getString("department");
			String designation=associateRS.getString("designation");
			String pancard=associateRS.getString("pancard");
			String emailId=associateRS.getString("emailId");
			int yearlyInvestmentUnder80C=associateRS.getInt("yearlyInvestmentUnder80C");
			Associate associate = new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, null, null);
			
			PreparedStatement pstmt2 = conn.prepareStatement("Select * from BankDetails where associateId="+associateId);
			ResultSet bankdetailsRs=pstmt2.executeQuery();
			bankdetailsRs.next();
			
			int accountNumber=bankdetailsRs.getInt("accountNumber");
			String bankName=bankdetailsRs.getString("bankName");
			String ifscCode=bankdetailsRs.getString("ifscCode");
			associate.setBankDetails(new BankDetails(accountNumber, bankName, ifscCode));
			
			PreparedStatement pstmt3 = conn.prepareStatement("select * from Salary where associateId="+associateId);
			
			
			ResultSet salaryRS =pstmt3.executeQuery();
			salaryRS.next();
			associate.setSalary(new Salary(salaryRS.getInt("basicSalary"), salaryRS.getInt("hra"), salaryRS.getInt("conveyenceAllowance"), salaryRS.getInt("otherAllowance"), salaryRS.getInt("personalAllowance"), salaryRS.getInt("monthlyTax"), salaryRS.getInt("epf"), salaryRS.getInt("companyPf"), salaryRS.getInt("grossSalary"), salaryRS.getInt("netSalary")));
			
			return associate;
			
		}	
		
		return null;
	}
	@Override
	public ArrayList<Associate> findAll() throws SQLException  {
		PreparedStatement pstmt1 = conn.prepareStatement("Select * from Associate");
		ResultSet associateRS = pstmt1.executeQuery();
		
		ArrayList<Associate> associates = new ArrayList<>();
		while(associateRS.next()) {
			
			int associateId = associateRS.getInt("associateId");
			String firstName=associateRS.getString("firstName");
			String lastName=associateRS.getString("lastName");
			String department=associateRS.getString("department");
			String designation=associateRS.getString("designation");
			String pancard=associateRS.getString("pancard");
			String emailId=associateRS.getString("emailId");
			int yearlyInvestmentUnder80C=associateRS.getInt("yearlyInvestmentUnder80C");
			Associate associate = new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, null, null);
			
			PreparedStatement pstmt2 = conn.prepareStatement("Select * from BankDetails where associateId="+associateId);
			ResultSet bankdetailsRs=pstmt2.executeQuery();
			bankdetailsRs.next();
			
			int accountNumber=bankdetailsRs.getInt("accountNumber");
			String bankName=bankdetailsRs.getString("bankName");
			String ifscCode=bankdetailsRs.getString("ifscCode");
			associate.setBankDetails(new BankDetails(accountNumber, bankName, ifscCode));
			PreparedStatement pstmt3 = conn.prepareStatement("select * from Salary where associateId="+associateId);
			ResultSet salaryRS =pstmt3.executeQuery();
			salaryRS.next();
			associate.setSalary(new Salary(salaryRS.getInt("basicSalary"), salaryRS.getInt("hra"), salaryRS.getInt("conveyenceAllowance"), salaryRS.getInt("otherAllowance"), salaryRS.getInt("personalAllowance"), salaryRS.getInt("monthlyTax"), salaryRS.getInt("epf"), salaryRS.getInt("companyPf"), salaryRS.getInt("grossSalary"), salaryRS.getInt("netSalary")));
			associates.add(associate);
		}
		return associates;
	}
	@Override
	public boolean update(Associate associate) {
	
		return false;
	}
	
}
------------------------------------------------------------------------------------------------------------------------------
package com.cg.project.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.project.exceptions.InvalidNumberRangeException;
import com.cg.project.matservices.MathServices;
import com.cg.project.matservices.MathServicesImpl;
public class MathServicesTest {
	private static MathServices mathServices;
	@BeforeClass
	public static void setUPTestEnv() {
		mathServices = new MathServicesImpl();
	}
	@Before
	public void setUpMockDataForTest() {
	}
	
	@Test(expected=InvalidNumberRangeException.class)
	public void testAddNumbesrForFirstNOInvalid() throws InvalidNumberRangeException {
		mathServices.addNums(-100, 200);
	}
	
	@Test(expected=InvalidNumberRangeException.class)
	public void testAddNumbesrForSecondNOInvalid() throws InvalidNumberRangeException {
		mathServices.addNums(100, -200);
	}
	
	@Test()
	public void testAddNumbesrForBothValidNo() throws InvalidNumberRangeException {
		int expectedAns=300;
		int actualAns=	mathServices.addNums(100, 200);
		Assert.assertEquals(expectedAns, actualAns);
	}
	
	
	@After
	public void tearDownMockDataForTest() {
		System.out.println("tearDownMockDataForTest()");
	}
	
	
	@AfterClass
	public static void tearDownTestEnv() {
		mathServices=null;
	}
}
---------------------------------------------------------------

import java.util.*;  
class MapInterfaceExample{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

Set set=map.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
	
-------------------------------------------------------------------------------------------------------	
ArrayList al=new ArrayList();  
al.add(Integer.valueOf(201));  
al.add(Integer.valueOf(101));  
al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
  
Collections.sort(al);  
------------------------------------------------------------------------------------------------

import java.util.*;  
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{  
  
Properties p=System.getProperties();  
Set set=p.entrySet();  
  
Iterator itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry entry=(Map.Entry)itr.next();  
System.out.println(entry.getKey()+" = "+entry.getValue());  
}  
  
}  
}	