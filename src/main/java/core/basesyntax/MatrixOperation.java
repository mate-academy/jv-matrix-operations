package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int [] counterDiagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            counterDiagonal[i] = matrix[i][matrix[0].length - i - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
