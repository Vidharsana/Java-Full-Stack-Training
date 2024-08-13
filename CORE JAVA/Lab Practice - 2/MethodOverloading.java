package com.vidhu;

public class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Welcome " + name);
	}
	void myMethod(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}
	void myMethod(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++)
			fact = fact * i;
			System.out.println("Factorial : " + fact);
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod(5);
		obj.myMethod("Vidhu");
		obj.myMethod(10,20);

	}

}
