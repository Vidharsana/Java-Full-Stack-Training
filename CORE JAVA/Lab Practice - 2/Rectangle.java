package com.vidhu;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();		
		System.out.println("The Area of the Rectangle is : " + (width * height));
		System.out.println("The Perimeter of the Rectangle is : " + ((2*width) + (2*height)));
	}
}
