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
        int maxMatrix = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (maxMatrix > matrix[i][j]) {
                    maxMatrix = matrix[i][j];
                }
            }
        }
        return maxMatrix;
    }

    public int getMax(int[][] matrix) {
        int minMatrix = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (minMatrix < matrix[i][j]) {
                    minMatrix = matrix[i][j];
                }
            }
        }
        return minMatrix;
    }
}
