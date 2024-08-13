package com.inheritance;
class A{
	int a = 10;
	A(String name){
		System.out.println("Welcome " + name);
	}
	void myMethod1() {
		System.out.println("I am a Super class Method");
	}
}
class B extends A{
	B(){
		super("Vidhu");
	}
	void myMethod2() {
		System.out.println("Super class variable : " + super.a);
		super.myMethod1();
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		B b = new B();
		b.myMethod2();
	}

}
