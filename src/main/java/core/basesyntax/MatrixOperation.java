package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int row = 0; row != matrix.length; row++) {
            diagonal[row] = matrix[row][row];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int column = 0, row = matrix.length - 1; row >= 0; column++, row--) {
            counterDiagonal[row] = matrix[row][column];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] column : matrix) {
            for (int row : column) {
                if (row < min) {
                    min = row;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] column : matrix) {
            for (int row : column) {
                if (row > max) {
                    max = row;
                }
            }
        }
        return max;
    }
}
