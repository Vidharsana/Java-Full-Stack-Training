package com.assignment3;

class Animal{
	void makeSound() {
		System.out.println("Animals make sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow");
	}
}
public class Animals {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();

	}

}
