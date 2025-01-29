package org.humber.week4;

public class NestedLoopExample1 {

    public static void main(String[] args) {
        int number = 3;

        for(int iCounter=1 ; iCounter <= number ; iCounter++) {

            for(int jCounter=1; jCounter <= iCounter; jCounter++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
