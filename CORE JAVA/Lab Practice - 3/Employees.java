package com.assignment3;
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
    double getSalary() {
        return 0.0; 
    }
}
class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is managing employee relations.");
    }
    void addEmployee(String employeeName) {
        System.out.println("Adding employee: " + employeeName);
    }
}
public class Employees {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee("John Doe");
        System.out.println("HR Manager's salary: " + hrManager.getSalary());
    }
}
