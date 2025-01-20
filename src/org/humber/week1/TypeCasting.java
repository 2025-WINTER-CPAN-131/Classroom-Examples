package org.humber.week1;

public class TypeCasting {

    public static void main(String[] args) {
        // Widening Casting
        int intValue = 10;
        double doubleValue = intValue; // implicit casting
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);

        // Narrowing Casting
        double doubleValue2 = 10.5; // 8 bytes
        int intValue2 = (int) doubleValue2; // explicit casting
        System.out.println("doubleValue2: " + doubleValue2);
        System.out.println("intValue2: " + intValue2);
    }
}
