package com.highpeak.dao.impl;

import org.hibernate.Session;

import com.highpeak.Entity.Employee;
import com.highpeak.dao.EmployeeDAO;
import com.highpeak.hb.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee employee) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			session.beginTransaction();
			Integer id = (Integer) session.save(employee);
			System.out.println("Employee is created with id::" + id);

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		
		Employee employee = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			 employee = session.get(Employee.class, employeeId);
			
			if(employee != null) {
				return employee;
			}else {
				System.out.println("Given id is not existed:::");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {
		
try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
	Employee employee = session.get(Employee.class, employeeId);
	if (employee != null) {
		employee.setSalary(newSal);
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
	} else {
		System.out.println("Employee doesn't exist with given id:::");
	}

}

	}
			
			
	@Override
	public void deleteEmployeeById(Integer employeeId) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Employee employee = session.get(Employee.class, employeeId);

			if (employee != null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			} else {
				System.out.println("Employee doesn't exist with given id:::");
			}

		}

	}

}
