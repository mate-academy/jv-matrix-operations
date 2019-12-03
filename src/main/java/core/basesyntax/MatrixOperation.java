package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {

        int[] counterDiagonal = new int[matrix.length];
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            counterDiagonal[j] = matrix[j][i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minMatrixValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (minMatrixValue > matrix[i][j]) {
                    minMatrixValue = matrix[i][j];
                }
            }
        }
        return minMatrixValue;
    }

    public int getMax(int[][] matrix) {
        int maxMatrixValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (maxMatrixValue < matrix[i][j]) {
                    maxMatrixValue = matrix[i][j];
                }
            }
        }
        return maxMatrixValue;
    }
}
