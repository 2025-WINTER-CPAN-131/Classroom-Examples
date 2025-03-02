package org.humber.week7;

public class DeepCopyArray {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] numbersCopy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }

        System.out.println("Original Array");
        for (int each : numbers) {
            System.out.println(each);
        }

        System.out.println("Copied Array");
        for (int each : numbersCopy) {
            System.out.println(each);
        }

        numbers[0] = 100;

        System.out.println("Original Array after changing the first element");
        for (int each : numbers) {
            System.out.println(each);
        }

        System.out.println("Copied Array after changing the first element in the original array");
        for (int each : numbersCopy) {
            System.out.println(each);
        }
    }
}
