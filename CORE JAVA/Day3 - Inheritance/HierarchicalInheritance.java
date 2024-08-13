package com.inheritance;

class Vehicle1{
	void noOfEngines() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler1 extends Vehicle1{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
class Scooty extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is Activa");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Bike1 bike1 = new Bike1();
		bike1.noOfWheels();
		bike1.brandName();
		bike1.noOfEngines();
		
		Scooty scooty = new Scooty();
		scooty.noOfEngines();
		scooty.noOfWheels();
		scooty.brandName();
		

	}

}
