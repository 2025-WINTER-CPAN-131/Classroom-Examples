package org.humber.week3;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.print("Enter a number to add to sum "+sum+" : ");
            number = scanner.nextInt();
            if(number < 0) {
                System.out.println("Negative numbers are not allowed");
                continue;
            }
            sum += number;
            System.out.println();
        } while (number != 0);
    }

}
