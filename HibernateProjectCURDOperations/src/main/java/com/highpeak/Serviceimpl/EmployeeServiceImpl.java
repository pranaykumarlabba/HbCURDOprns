package com.highpeak.Serviceimpl;

import com.highpeak.Entity.Employee;
import com.highpeak.Service.EmployeeService;
import com.highpeak.dao.impl.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void createEmployee(Employee employee) {
		new EmployeeDAOImpl().addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return new EmployeeDAOImpl().fetchEmployeeById(employeeId);
	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {
		
		new EmployeeDAOImpl().updateEmployeeById(employeeId, newSal);
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		
		new EmployeeDAOImpl().deleteEmployeeById(employeeId);
	}

}
