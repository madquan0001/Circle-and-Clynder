package com.company;

public class Circle {
    private double radius = 1;
    private String color = "blue";

    Circle(){}

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "This circle has radius: "+getRadius()+" and color: "+getColor();
    }
}