package org.humber.week7;

public class MultiArrayExample1 {

    public static void main(String[] args) {
        //int[row][col]
        int[][] matrix1 = new int[2][2];
        //Row 1
        matrix1[0][0] = 10;
        matrix1[0][1] = 20;

        //Row 2
        matrix1[1][0] = 30;
        matrix1[1][1] = 40;

        int[][] matrix2 = {
            {15, 10000}, //Row 1 matrix2[0].length
            {39, 89}  //Row 2 matrix2[1].length
        };

        printMatrix(matrix1);
        printMatrix(matrix2);

        int[][] sum = new int[2][2];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                sum[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        printMatrix(sum);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
