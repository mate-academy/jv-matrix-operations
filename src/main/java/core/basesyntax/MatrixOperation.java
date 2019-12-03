package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            counterDiagonal[j] = matrix[j][i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max > matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int getMax(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (min < matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
}
