package org.humber.week3;

import java.util.Scanner;

public class IfElseStatementsExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            if(number == 0) {
                System.out.println("The number is zero");
            } else {
                System.out.println("The number is even");
            }
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

}
