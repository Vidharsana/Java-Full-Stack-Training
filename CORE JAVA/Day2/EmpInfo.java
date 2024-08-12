package com.vidhu;

class Employee1 {
    int employeeId;
    String employeeName;
    float employeeSalary;
    Employee1(int employeeId, String employeeName, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    void display() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
    void updateSalary(float newSalary) {
        this.employeeSalary = newSalary;
    }
    float calculateAnnualSalary() {
        return employeeSalary * 12;
    }
}
public class EmpInfo {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(101, "Vidhu", 20000.0f);
        emp1.display();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());
        
        Employee1 emp2 = new Employee1(102, "Thari", 30000.0f);
        emp2.display();
        System.out.println("Annual Salary: " + emp2.calculateAnnualSalary());
        
        emp1.updateSalary(22000.0f);
        System.out.println("Updated Details for Emp1:");
        emp1.display();
        System.out.println("Updated Annual Salary: " + emp1.calculateAnnualSalary());
    }
}
