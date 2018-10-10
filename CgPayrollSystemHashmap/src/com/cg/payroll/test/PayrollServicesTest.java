package com.cg.payroll.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.daoServices.AssociateDAO;
import com.cg.payroll.services.PayrollServices;

public class PayrollServicesTest {
	private static PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDAO;
	
	@BeforeClass
	public static void setUpEnv(){
		mockAssociateDao = EasyMock.mock(AssociateDAO.class);
		payrollServices = new PayrollServicesImpl(mockAssociateDao);
	}
	@AfterClass
	public static void tearDownEnv(){
		
	}
	@Test
	public void testAcceptAssociateDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAssociateDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAssociateDetails() {
		fail("Not yet implemented");
	}

}
