package com.capgemini.employeeapp.model;

public class Employee {
private int emoloyeeId;
private String employeeName;
private double employeeSalary;
private String employeeDepartment;
public Employee(int emoloyeeId, String employeeName, double employeeSalary, String employeeDepartment) {
	super();
	this.emoloyeeId = emoloyeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.employeeDepartment = employeeDepartment;
}
public Employee() {
	super();
	
}
public int getEmoloyeeId() {
	return emoloyeeId;
}
public void setEmoloyeeId(int emoloyeeId) {
	this.emoloyeeId = emoloyeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
}
