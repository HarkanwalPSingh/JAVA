package com.cg.project.mathservices;

public class MainClass {

	public static void main(String[] args) {
		MathServices services = new MathServicesImpl();
		int add=services.addNumbers(10, 2);
		int sub=services.subtractNumbers(10, 2);
		int multiply=services.multiplyNumbers(10, 2);
		System.out.println(add+" "+sub+" "+multiply);
	}

}
