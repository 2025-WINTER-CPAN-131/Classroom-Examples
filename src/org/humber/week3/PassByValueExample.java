package org.humber.week3;

public class PassByValueExample {

    public static void main(String[] args) {
        int length = 5;
        Sqaure smallSqaure = Sqaure.createSquare(length);
        System.out.println("Length " + length);
        System.out.println("Small Sqaure " + smallSqaure.getLength());
    }
}


class Sqaure {

    private double length;

    private Sqaure(double length) {
        this.length = length;
    }

    public static Sqaure createSquare(double length) {
        if (length <= 5) {
            return null;
        }
        length -= 5;
        return new Sqaure(length);
    }

    public double getLength() {
        return length;
    }
}
