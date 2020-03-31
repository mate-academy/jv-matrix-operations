package core.basesyntax;

import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][matrix.length - 1 - i];
        }
        return result;
    }

    public int getMin(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            result = result > matrix[i][0] ? matrix[i][0] : result;
        }
        return result;
    }

    public int getMax(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            result = result < matrix[i][matrix.length - 1] ? matrix[i][matrix.length - 1] : result;
        }
        return result;
    }
}
