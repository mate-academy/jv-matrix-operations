package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            diagonal[j] = matrix[i][j];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            counterDiagonal[matrix.length - j - 1] = matrix[i][j];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] arr : matrix) {
            for (int element : arr) {
                min = Integer.min(min, element);
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] arr : matrix) {
            for (int element : arr) {
                max = Integer.max(max, element);
            }
        }
        return max;
    }
}
