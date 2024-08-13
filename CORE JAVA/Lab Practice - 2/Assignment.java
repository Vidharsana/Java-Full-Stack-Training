package com.vidhu;

import java.util.Scanner;

class Student{
	int regNo;
	String studentName;
	int subject[] = new int[5];
	Student(int regNo, String studentName){
		this.regNo = regNo;
		this.studentName = studentName;
	}
	void getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 5 Subjects : ");
		for(int i=0;i<subject.length;i++) {
			subject[i] = sc.nextInt();
		}
	}
	void displayGrade() {
		System.out.println("Student Id : " + regNo);
		System.out.println("Student Name : " + studentName);
		int sum = 0;
		for(int i=0;i<subject.length;i++) {
			sum = sum + subject[i];
		}
		System.out.println("Sum : " + sum);
	}
}

public class Assignment {

	public static void main(String[] args) {
		Student obj = new Student(101, "Vidhu");
		obj.getMarks();
		obj.displayGrade();
	}

}
