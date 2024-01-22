package com.example.hr;

public class Employee {
	
	private String name ;
	private int empid;
	private double empsalary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public void print_Name() {
		System.out.println("Employee name - "+ name);

	}
	public void print_Salary() {
		System.out.println("Employee salary - "+ empsalary);

	}
	public void print_empid() {
		System.out.println("Employee id - "+ empid);

	}

	
}
