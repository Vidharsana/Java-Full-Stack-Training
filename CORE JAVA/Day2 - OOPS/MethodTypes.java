package com.oops;

public class MethodTypes {
	void myMethod1() {
		System.out.println("Instances or Object Methods");
	}
	static void myMethod2() {
		System.out.println("Static or Class Method");
	}

	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.myMethod1();
		MethodTypes.myMethod2();

	}

}
