package org.humber.week4;

import java.util.Scanner;

public class DoWhileLoopExample1 {

    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            if(input == 0) {
                System.out.println("Please enter a number other than 0");
            }
        } while (input == 0);
        System.out.println("You entered: "+input);
    }
}
