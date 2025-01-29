package org.humber.week4;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("red");
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        if(!"white".equalsIgnoreCase(color)) {
            super.setColor(color);
        }
    }

    public void printCircle() {
        System.out.println("Circle: radius = " + radius + ", color = " + getColor());
    }

}
