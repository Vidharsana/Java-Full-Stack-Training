package com.inheritance;

class Aa{
	Aa(){
		System.out.println("A");
	}
}
class Bb extends Aa{
	Bb(){
		System.out.println("B");
	}
}
public class ConstructorInvocation {

	public static void main(String[] args) {
		Bb bb = new Bb();

	}

}
