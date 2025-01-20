package org.humber.week2;

import org.humber.week2.Circle;

import java.util.Scanner;

public class CircleExample {
    public static void main(String[] args) {
        Circle circle, circle2;
        circle = new Circle();
        circle.setRadius(10);
        System.out.println("Radius: " + circle.getRadius());

        circle2 = new Circle(20);
        System.out.println("Radius: " + circle2.getRadius());
    }
}
