package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sum[i] = matrix[i][i];
        }
        return sum;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sum[i] = matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
