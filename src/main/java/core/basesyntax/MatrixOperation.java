package core.basesyntax;

import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int j = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] += matrix[i][j];
            j--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int[] min = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            min[i] += matrix[i][0];
        }
        Arrays.sort(min);
        return min[0];
    }

    public int getMax(int[][] matrix) {
        int[] max = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            max[i] += matrix[i][matrix.length - 1];
        }
        Arrays.sort(max);
        return max[max.length - 1];
    }
}
