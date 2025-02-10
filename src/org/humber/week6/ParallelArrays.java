package org.humber.week6;

public class ParallelArrays {

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack", "Jill", "Joe"};
        int[] studentIds = {1001, 1002, 1003, 1004, 1005};
        int[] cpan131Scores = {90, 80, 70, 60, 50};
        int[] cpan132Scores = {85, 75, 65, 55, 45};
        int[] cpan133Scores = {95, 85, 75, 65, 55};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Student ID: " + studentIds[i]);
            System.out.println("CPAN 131 Score: " + cpan131Scores[i]);
            System.out.println("CPAN 132 Score: " + cpan132Scores[i]);
            System.out.println("CPAN 133 Score: " + cpan133Scores[i]);
            System.out.println("Average Score: " + (cpan131Scores[i] + cpan132Scores[i] + cpan133Scores[i]) / 3);
        }
    }


}
