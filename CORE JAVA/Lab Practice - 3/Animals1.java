package com.assignment3;
class Animal1 {
    void move() {
        System.out.println("Animal is moving.");
    }
}
class Cheetah extends Animal1 {
    void move() {
        System.out.println("Cheetah is running.");
    }
}
public class Animals1 {
    public static void main(String[] args) {
        Cheetah myCheetah = new Cheetah();
        myCheetah.move();
    }
}