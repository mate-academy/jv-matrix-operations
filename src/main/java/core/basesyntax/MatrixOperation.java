package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][matrix[0].length - 1 - i];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if (min > matrix[i][y]) {
                    min = matrix[i][y];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if (max < matrix[i][y]) {
                    max = matrix[i][y];
                }
            }
        }
        return max;
    }
}
