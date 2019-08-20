package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diag[i] = matrix[i][j];
                }
            }
        }
        return diag;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
