package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	void InsuranceScheme(Employee employee);
	void DisplayDetails(Employee employee);
	public void addEmployee(Employee emp);
	public boolean deleteEmployee(int id);
}
