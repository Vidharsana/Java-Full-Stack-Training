package com.assignment3;

class Vehicle{
	void drive() {
		System.out.println("Drive a car");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class Vehicles {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();

	}

}
