package com.highpeak.client;

import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.highpeak.Entity.Employee;
import com.highpeak.Service.EmployeeService;
import com.highpeak.Serviceimpl.EmployeeServiceImpl;
import com.highpeak.hb.HibernateUtil;

public class TestClient {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		

			 //createEmployee(employeeService);
			  //getEmployeeById(employeeService);
			//updateEmployee(employeeService);
			deleteEmployeeById(employeeService);
	}
	private static void deleteEmployeeById(EmployeeService employeeService) {
		employeeService.deleteEmployeeById(3);

	}

	private static void updateEmployee( EmployeeService employeeService) {
		employeeService.updateEmployeeById(4, 854000.00);

	}

	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee = employeeService.getEmployeeById(1);
		System.out.println(employee);

	}

	private static void createEmployee(EmployeeService employeeService) {
		employeeService.createEmployee(getEmployeeOne());
	}

	public static Employee getEmployeeOne() {
		Employee employee = new Employee();
		employee.setEmployeeName("Jon");
		employee.setEmail("jon143@gmail.com");
		employee.setDateOfJoining(new Date());
		employee.setSalary(1000000.00);
		return employee;
	

	}
}

