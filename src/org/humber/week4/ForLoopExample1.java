package org.humber.week4;

import java.util.Scanner;

public class ForLoopExample1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt(); // 100

        int sum = 0;

        /*
        for( <initialization> ; <condition> ; <increment/decrement> ) {
            // code block
        }
        */

        for(int counter=1 ; counter <= number ; counter++) {
//            sum = sum + counter;
            sum += counter;
        }

        System.out.println("The sum of numbers from 1 to "+number+" is "+sum);


    }
}
