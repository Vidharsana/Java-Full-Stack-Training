package com.vidhu;

class Dog{
	String dogName;
	String dogBreed;
	Dog(String dogName, String dogBreed){
		this.dogName = dogName;
		this.dogBreed = dogBreed;
	}
	void display() {
		  System.out.println("Dog's Name: " + dogName);
	      System.out.println("Dog's Breed: " + dogBreed);
	}
	void setDog(String dogName, String dogBreed) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }
}

public class Dogs {

	public static void main(String[] args) {
		Dog obj = new Dog("Rose", "Golden Retriever");
		obj.display();
		System.out.println("Updated Info");
		obj.setDog("Pinky" , "Golden Retriever");
		obj.display();
	}

}
