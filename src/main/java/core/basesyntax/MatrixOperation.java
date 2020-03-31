package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][i];
        }
        return arr;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][matrix[i].length - 1 - i];
        }
        return arr;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] < min) {
                    min = matrix[i][k];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] > max) {
                    max = matrix[i][k];
                }
            }
        }
        return max;
    }
}
