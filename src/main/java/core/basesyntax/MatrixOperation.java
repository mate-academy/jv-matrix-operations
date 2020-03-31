package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] checkDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            checkDiagonal[i] = matrix[i][i];
        }
        return checkDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] checkCounterDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            checkCounterDiagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return checkCounterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
