package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonalMatrix = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonalMatrix[i] = matrix[i][i];
        }
        return diagonalMatrix;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix.length - (i + 1)];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minimum = matrix[0][0];
        for (int[] i: matrix) {
            for (int j: i) {
                if (j < minimum) {
                    minimum = j;
                }
            }
        }
        return minimum;
    }

    public int getMax(int[][] matrix) {
        int maximum = matrix[0][0];
        for (int[] i: matrix) {
            for (int j: i) {
                if (j > maximum) {
                    maximum = j;
                }
            }
        }
        return maximum;
    }
}
