package com.company;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("Circle Area: "+circle.getArea());
        System.out.println(circle.toString());

        Circle circle1 = new Circle(2.5, "green");
        System.out.println("Circle Area: "+circle1.getArea());
        System.out.println(circle1.toString());
    }
}