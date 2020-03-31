package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0];
        }
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] += matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0];
        }
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] += matrix[i][matrix.length - 1 - i];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        int min = Integer.MAX_VALUE;
        for (int[] line: matrix) {
            for (int num: line) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        int max = Integer.MIN_VALUE;
        for (int[] line: matrix) {
            for (int num: line) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}
