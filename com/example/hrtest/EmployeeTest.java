package com.example.hrtest;
import com.example.hr.Employee;
public class EmployeeTest {
public static void main(String[] args) {
	
	Employee er = new Employee();
	er.setName("Sivakumar");
	er.setEmpid(54321);
	er.setEmpsalary(65000);
	
	er.print_Name();
	er.print_empid();
	er.print_Salary();
	
	
}
}
