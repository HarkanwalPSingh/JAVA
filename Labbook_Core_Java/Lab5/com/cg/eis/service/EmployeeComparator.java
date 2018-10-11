package com.cg.eis.service;

import java.util.Comparator;

import com.cg.eis.bean.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary()-o2.getSalary();
	}

}
