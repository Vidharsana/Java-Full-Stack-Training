package com.inheritance;

class Vehicles{
	void noOfEngines() {
		System.out.println("I have one Engine");
	}
}
class TwoWheelers extends Vehicles{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bikes extends TwoWheelers{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Bikes bikes = new Bikes();
		bikes.noOfWheels();
		bikes.brandName();
		bikes.noOfEngines();
	}
}