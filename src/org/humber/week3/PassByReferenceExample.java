package org.humber.week3;

public class PassByReferenceExample {

    public static void main(String[] args) {
        Circle smallCircle = Circle.createCircle(10);
        Circle bigCircle = Circle.createCircle(200);
        CircleUpdater circleUpdater = new CircleUpdater();
        System.out.println("Before update: " + smallCircle.getRadius());
        circleUpdater.updateCircle(smallCircle, 100);
        System.out.println("After update: " + smallCircle.getRadius());
        System.out.println(bigCircle);
    }
}

class CircleUpdater {
    public void updateCircle(Circle circle, double radius) {
        circle.setRadius(radius);
    }

}

class Circle {

    private double radius;

    private Circle(double radius) {
        this.radius = radius;
    }

    public static Circle createCircle(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        return new Circle(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
