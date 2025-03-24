package org.humber.week9;

public class StringExample {

    public static void main(String[] args) {
        String str = "Hello, World!";
        str = "Hey";
        String str1 = new String("Hello, World!");
        str1 = new String("Hey");
        str1 = str1.concat("Hello").concat("World");
    }
}
