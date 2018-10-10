package com.cg.payroll.util;

public class TestMain {

	public static void main(String[] args) {
		if(ConnectionProvider.getDBConnection()!=null)
			System.out.println("Connected");
		else
			System.out.println("Some Error");

	}

}
