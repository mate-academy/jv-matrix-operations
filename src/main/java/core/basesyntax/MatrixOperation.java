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

        int [] flat = new int [matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                flat[count++] = matrix[i][j];
            }
        }
        Arrays.sort(flat);

        return flat[0];
    }

    public int getMax(int[][] matrix) {

        int [] flat = new int [matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                flat[count++] = matrix[i][j];
            }
        }
        Arrays.sort(flat);

        return flat[flat.length - 1];
    }
}
