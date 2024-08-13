package com.inheritance;

class A1{
	A1(){
		System.out.println("A");
	}
	A1(int a){
		this();
		System.out.println("A1");
	}
}
class B1 extends A1{
	B1(){
		super(5);
		System.out.println("B");
	}
	B1(int a){
		System.out.println("B1");
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		B1 b1 = new B1(5);

	}

}
