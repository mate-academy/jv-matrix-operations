package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] fin = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            fin[i] = matrix[i][i];
        }
        return fin;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] fin = new int[matrix.length];
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length; i++, j--) {
            fin[i] = matrix[i][j];
        }
        return fin;
    }

    public int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
        }
        return max;
    }
}
