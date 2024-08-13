package com.vidhu;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = Math.PI;
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = pi * Math.pow(radius, 2);
        double circumference = 2 * pi * radius;
        System.out.println("The Area of the Circle is : " + area);
        System.out.println("The Circumference of the Circle is : " + circumference);
        sc.close();
    }
}
