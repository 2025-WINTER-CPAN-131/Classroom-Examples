package org.humber.week5;

public class ArraysExample1 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        int[] numbers2 = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        for (int each : numbers2) {
            System.out.println(each);
        }


    }

}
