package org.humber.week7;

public class MultiplyMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };

        printMatrix(matrix1);
        printMatrix(matrix2);

        int[][] product = new int[2][2];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                for(int i = 0; i < matrix1[row].length; i++) {
                    product[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }

        printMatrix(product);
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
