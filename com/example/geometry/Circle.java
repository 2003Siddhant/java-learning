package com.example.geometry;

public class Circle {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public void area() {
        double a = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of circle  is " + a);
    }

    // @Override
    // public String toString() {
    // return "Circle={" + radius + " }";
    // }
}
