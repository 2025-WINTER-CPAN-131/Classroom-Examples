package org.humber.week3;

public class StringReversal {


    public static void main(String[] args) {
        String str = "MADAM";
        for(int index = str.length() - 1; index >= 0; index--) {
            System.out.print(str.charAt(index));
        }
    }

}
