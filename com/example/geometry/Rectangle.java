package com.example.geometry;

public class Rectangle {
    private double length, breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        double a = length * breadth;
        System.out.println("the area of Rectangle is " + a);
    }

    public void perimeter() {
        double a = length * breadth;
        System.out.println("the perimeter of rectangle is " + a);
    }
}
