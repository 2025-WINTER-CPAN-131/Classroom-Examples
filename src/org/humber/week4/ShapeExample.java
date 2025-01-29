package org.humber.week4;

public class ShapeExample {

    public static void main(String[] args) {

        Shape shape1 = new Shape();
        System.out.println("Shape1 color: " + shape1.getColor());

        Shape shape2 = new Shape("red");
        System.out.println("Shape2 color: " + shape2.getColor());

        shape1.setColor("blue");
        System.out.println("Shape1 color: " + shape1.getColor());


        Circle circle1 = new Circle(5.0);
        circle1.printCircle();

        circle1.setColor("green");
        circle1.printCircle();

        circle1.setColor("WhiTE");
        circle1.printCircle();


    }
}
