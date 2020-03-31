package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0;i < matrix.length;i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0;i < matrix.length;i++) {
            diagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int[] row: matrix) {
            for (int i: row) {
                if (i < minValue) {
                    minValue = i;
                }
            }
        }
        return minValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] row: matrix) {
            for (int i: row) {
                if (i > maxValue) {
                    maxValue = i;
                }
            }
        }
        return maxValue;
    }
}
