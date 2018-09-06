package com.capgemini.domain;

public class Employee {
	private int employeeid;
	private String empName;
	private double salary;
	private String empDept;
	public Employee(int employeeid, String empName, double salary, String empDept) {
		super();
		this.employeeid = employeeid;
		this.empName = empName;
		this.salary = salary;
		this.empDept = empDept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
}