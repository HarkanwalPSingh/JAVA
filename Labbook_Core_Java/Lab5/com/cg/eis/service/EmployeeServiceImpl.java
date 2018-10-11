package com.cg.eis.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private int index = 1;

	HashMap<Integer, Employee> list = new HashMap<>();
	
	public void allEmployee() {
		for(Map.Entry  m : list.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	@Override
	public void addEmployee(Employee emp) {
		list.put(index++, emp);
	}

	@Override
	public boolean deleteEmployee(int id) {
		int removeIndex = -1;
		for(Map.Entry  m : list.entrySet()) {
			Employee emp = (Employee)m.getValue();
			if(emp.getId()==id)
				removeIndex = (int) m.getKey();
		}
		list.remove(removeIndex);
		return false;
	}

	@Override
	public void InsuranceScheme(Employee employee) {
		int salary = employee.getSalary();
		String designation = employee.getDesignation();
		if ((salary >= 5000 && salary < 20000) || designation == "System Associate")
			employee.setInsuranceScheme("Scheme C");
		else if ((salary >= 20000 && salary < 40000) || designation == "Programmer")
			employee.setInsuranceScheme("Scheme B");
		else if ((salary >= 40000) || designation == "Manager")
			employee.setInsuranceScheme("Scheme A");
		else if ((salary < 5000) || designation == "Clerk")
			employee.setInsuranceScheme("No Scheme");
		else
			employee.setInsuranceScheme("Scheme not applicable for given details");
	}

	@Override
	public void DisplayDetails(Employee employee) {
		System.out.println(employee);
	}
	
	public void employeeDetailsInsuranceScheme(String scheme) {
		for(Map.Entry  m : list.entrySet()) {
			if(((Employee)m.getValue()).getInsuranceScheme().compareTo(scheme)==0)
				System.out.println(m.getValue());
		}
	}
	
	public void sortEmployee() {
	}
}
