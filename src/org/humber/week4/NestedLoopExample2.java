package org.humber.week4;

public class NestedLoopExample2 {

    public static void main(String[] args) {
        int number = 10;

        for(int iCounter=1 ; iCounter <= number ; iCounter++) {

            for(int jCounter=1; jCounter <= number-iCounter; jCounter++) {
                System.out.print("  ");
            }

            for(int jCounter=1; jCounter <= iCounter; jCounter++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
