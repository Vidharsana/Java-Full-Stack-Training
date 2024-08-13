package com.oops;

public class ConstructorOverloading1 {
	ConstructorOverloading1(String name) {
		System.out.println("Welcome " + name);
	}
	ConstructorOverloading1(int a, int b) {
		this("Vidhu");
		System.out.println("Addition : " + (a + b));
	}
	ConstructorOverloading1(int n) {
		this(10,20);
		int fact = 1;
		for(int i=1;i<=n;i++)
			fact = fact * i;
			System.out.println("Factorial : " + fact);
	}
	public static void main(String[] args) {
		ConstructorOverloading1 obj1 = new ConstructorOverloading1(5);

	}

}
