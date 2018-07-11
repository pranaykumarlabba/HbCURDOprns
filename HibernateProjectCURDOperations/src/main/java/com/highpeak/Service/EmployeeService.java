package com.highpeak.Service;

import com.highpeak.Entity.Employee;

public interface EmployeeService {
	
	void createEmployee(Employee employee);
	Employee getEmployeeById(int employeeId);
	void updateEmployeeById(int employeeId, Double newSal);
	void deleteEmployeeById(Integer employeeId);

}
