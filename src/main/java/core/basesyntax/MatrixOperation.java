package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int iterator = 0; iterator < matrix.length; iterator++) {
            diagonal[iterator] = matrix[iterator][iterator];
        }

        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int row = 0, column = matrix.length - 1; row < matrix.length; row++, column--) {
            counterDiagonal[row] = matrix[row][column];
        }

        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix [0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                min = min <= matrix[row][column] ? min : matrix[row][column];
            }
        }

        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix [0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                max = max >= matrix[row][column] ? max : matrix[row][column];
            }
        }

        return max;
    }
}
