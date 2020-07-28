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
                if (i + j == matrix.length - 1) {
                    counterDiagonal[i] = matrix[i][j];
                }
            }
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }
}
