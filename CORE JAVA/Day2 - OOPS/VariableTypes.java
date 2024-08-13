package com.oops;

public class VariableTypes {
	int b = 20; //Instance or Object variable
	static int c = 30; //static or class variable
	public static void main(String[] args) {
		int a = 10; //local variable
		System.out.println("Local Variable : " + a);
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.b);
		System.out.println(VariableTypes.c);
	}

}
