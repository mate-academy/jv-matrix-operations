package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] diagonal = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int [] counterDiagonal = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                counterDiagonal[i] = matrix[i][matrix.length - 1 - i];
            }
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minM = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < minM) {
                    minM = matrix[i][j];
                }
            }
        }
        return minM;
    }

    public int getMax(int[][] matrix) {
        int maxM = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxM) {
                    maxM = matrix[i][j];
                }
            }
        }
        return maxM;
    }
}
