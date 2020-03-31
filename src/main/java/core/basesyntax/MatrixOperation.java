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
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < minElement) {
                    minElement = matrix[row][col];
                }
            }
        }
        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > maxElement) {
                    maxElement = matrix[row][col];
                }
            }
        }
        return maxElement;
    }
}
