package com.cg.project.inheritance;

public class MainClass {

	public static void main(String[] args) {

		CEmployee emp1 = new CEmployee(101, "Sahil", "Singh", 50000, 0, 50000, 500);
		emp1.TotalSalary();
		
		System.out.println(emp1.toString());
		/*System.out.println(emp1);*/
		
		Employee emp2 = new CEmployee(101, "Sahil", "Singh", 50000, 0, 50000, 500);
		emp2.TotalSalary();
		
		System.out.println(emp2);
	}
}
