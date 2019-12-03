package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int n = matrix.length;
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                diagonal[i] = matrix[i][n - i - 1];
            }
        }
        return diagonal;

    }

    public int getMin(int[][] matrix) {
        int smallest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public int getMax(int[][] matrix) {
        int biggest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggest < matrix[i][j]) {
                    biggest = matrix[i][j];
                }
            }
        }
        return biggest;
    }
}
