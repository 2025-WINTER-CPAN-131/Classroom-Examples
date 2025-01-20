package org.humber.week2;


public class Circle {

    private double radius;
    static final double PI = 3.14159565;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

