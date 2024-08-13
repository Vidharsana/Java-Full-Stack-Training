package com.assignment3;

class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employeeee extends Person1 {
    private String employeeId;
    private String jobTitle;

    public Employeeee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Persons {
    public static void main(String[] args) {
        Employeeee employeeee = new Employeeee("John", "Doe", "E12345", "Software Engineer");
        System.out.println("First Name: " + employeeee.getFirstName());
        System.out.println("Last Name: " + employeeee.getLastName());
        System.out.println("Employee ID: " + employeeee.getEmployeeId());
    }
}
