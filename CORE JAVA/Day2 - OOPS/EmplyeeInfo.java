package com.oops;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	Employee(int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	void display() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee salary : " + employeeSalary);
	}
}

public class EmplyeeInfo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Vidhu", 20000.0f);
		emp1.display();
		Employee emp2 = new Employee(102, "Thari", 30000.0f);
		emp2.display();

	}

}
