package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] arrDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrDiagonal[i] = matrix[i][i];
        }
        return arrDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] arrDiagonal = new int[matrix.length];
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            arrDiagonal[j] = matrix[j][i];
        }
        return arrDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
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
