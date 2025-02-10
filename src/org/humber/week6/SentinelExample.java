package org.humber.week6;

import java.util.Scanner;

public class SentinelExample {

    public static void main(String[] args) {
        int[] numArray = new int[5000];

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        do {
            System.out.print("Enter a number: ");
            numArray[index] = scanner.nextInt();
        } while (numArray[index++] != -1);

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] == -1) {
                break;
            }
            System.out.print(numArray[i] + " ");
        }

    }

}
