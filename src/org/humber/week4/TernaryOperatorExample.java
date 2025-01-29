package org.humber.week4;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 10;

        int result = number1 >= number2 ? (number1 - number2) : (number2 - number1);

        System.out.println("Result: " + result + " Number2 - Number1 = " + (number2 - number1));

    }


}
