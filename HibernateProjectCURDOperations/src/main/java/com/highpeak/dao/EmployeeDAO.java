package com.highpeak.dao;

import com.highpeak.Entity.Employee;

public interface EmployeeDAO {
	
	void addEmployee(Employee employee);
	Employee fetchEmployeeById(int employeeId);
	void updateEmployeeById(int employeeId, Double newSal);
	void deleteEmployeeById(Integer employeeId);

}
