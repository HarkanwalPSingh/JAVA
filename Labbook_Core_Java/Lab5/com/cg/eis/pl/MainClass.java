package com.cg.eis.pl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;
import com.sun.javafx.geom.AreaOp.AddOp;

import sun.print.resources.serviceui;

public class MainClass {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int id1,salary1;
		String name1, designation1;
		System.out.println("Type the details of the employee in the following order : EmployeeId, Name, Salary, Designation");
		id1 = sc.nextInt()	;
		name1 = sc.next();
		salary1 = sc.nextInt()	;
		designation1 = sc.next();
		
		Employee employee = new Employee(id1, name1, salary1,designation1);*/
		Employee emp1 = new Employee(101, "Suresh", 3000, "Clerk");
		Employee emp2 = new Employee(102, "Kumar", 15000, "System Associate");
		Employee emp3 = new Employee(103, "Hima", 30000, "Programmer");
		Employee emp4= new Employee(104, "Das", 50000, "Manager");
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		service.InsuranceScheme(emp1);
		service.InsuranceScheme(emp2);
		service.InsuranceScheme(emp3);
		service.InsuranceScheme(emp4);
		
		service.addEmployee(emp1);
		service.addEmployee(emp2);
		service.addEmployee(emp3);
		service.addEmployee(emp4);
		
		
		
		service.DisplayDetails(emp1);
		
		service.deleteEmployee(103);
		service.allEmployee();
		
		service.employeeDetailsInsuranceScheme("Scheme C");
		
		
		
		
	}

}
