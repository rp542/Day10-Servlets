package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> findAllEmployees() {
		return employees;
	}

	@Override
	public Employee findEmployeeByID(int emoloyeeId) {
		for (Employee employee : employees) {
			if (employee.getEmoloyeeId() == emoloyeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [employees=" + employees + "]";
	}

	@Override
	public boolean deleteEmployee(int emoloyeeId) {
		for (Employee employee : employees) {
			if (employee.getEmoloyeeId() == emoloyeeId) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		
		return employees.add(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		for(Employee e:employees)
		{
			if(e.getEmoloyeeId()==employee.getEmoloyeeId())
			{
				e.setEmployeeName(employee.getEmployeeName());
				e.setEmployeeSalary(employee.getEmployeeSalary());
				e.setEmployeeDepartment(employee.getEmployeeDepartment());
				
			}
			return e;	
		}
		return null;
	}

	@Override
	public Employee findEmployeeById(int emloyeeId) {
		// TODO Auto-generated method stub
		return null;
	}


}