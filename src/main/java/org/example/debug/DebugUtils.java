package org.example.debug;

public class DebugUtils {
    public static <T> void printMatrix(T[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
