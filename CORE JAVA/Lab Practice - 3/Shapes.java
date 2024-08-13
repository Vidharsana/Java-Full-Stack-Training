package com.assignment3;
class Shape {
    double getArea() {
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
}
public class Shapes {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        System.out.println("The area of the rectangle is: " + myRectangle.getArea());
    }
}
