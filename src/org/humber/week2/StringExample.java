package org.humber.week2;

public class StringExample {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = new String("Hello, World!").intern();
        boolean isEqual = (str == str2);
        System.out.println("str == str2 " + isEqual);
        System.out.println("str == str3 " + (str == str3));
        System.out.println("str.equals(str3) " + (str.equals(str3)));


    }
}
