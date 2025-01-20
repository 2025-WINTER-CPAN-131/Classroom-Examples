package org.humber.week1;

import java.util.Random;

public class MathClassExample {
    public static void main(String[] args) {
        // Example 1: Absolute value
        double num1 = -10.5;
        double absValue = Math.abs(num1);
        System.out.println("Absolute value of " + num1 + " is " + absValue);

        // Example 2: Rounding
        double num2 = 15.67;
        long rounded = Math.round(num2);
        System.out.println("Rounded value of " + num2 + " is " + rounded);

        // Example 3: Ceiling
        double num3 = 12.34;
        double ceilValue = Math.ceil(num3);
        System.out.println("Ceiling value of " + num3 + " is " + ceilValue);

        // Example 4: Floor
        double num4 = 14.89;
        double floorValue = Math.floor(num4);
        System.out.println("Floor value of " + num4 + " is " + floorValue);

        // Example 5: Maximum
        int maxNum = Math.max(25, 30);
        System.out.println("Maximum value is " + maxNum);

        // Example 6: Minimum
        int minNum = Math.min(15, 20);
        System.out.println("Minimum value is " + minNum);

        // Example 7: Random number
        double randomNum = Math.random(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random number is " + randomNum);

        // Example 8: Power
        double base = 2;
        double exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
