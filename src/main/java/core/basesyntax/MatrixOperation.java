package core.basesyntax;

import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] diagonal = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }

        return diagonal;
    }

    public int getMin(int[][] matrix) {

        int min = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                }
            }
        }


        return min;
    }

    public int getMax(int[][] matrix) {

        int max = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
        }


        return max;
    }
}
