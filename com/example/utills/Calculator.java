package com.example.utills;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(3.9);
        c.area();

        Rectangle r = new Rectangle(7.6, 8.9);
        r.area();
        r.perimeter();
    }
}
