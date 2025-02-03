package org.humber.week5;


class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}


public class StaticPolymorphismExample {


    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(10, 20));
        System.out.println(arithmetic.add(10, 20, 30));
        System.out.println(arithmetic.add(10, 20, 30, 40));


        System.out.println(arithmetic.add(10.5, 20.5));
        System.out.println(arithmetic.add(10.5, 20.5, 30.5));
        System.out.println(arithmetic.add(10.5, 20.5, 30.5, 60.5));
    }

}
