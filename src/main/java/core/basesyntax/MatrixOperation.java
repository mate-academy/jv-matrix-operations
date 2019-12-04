package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int idxArr = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    arr[idxArr] = matrix[i][j];
                    idxArr++;
                }
            }
        }
        return arr;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int idxArr = 0;
        int reversIdx = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            arr[idxArr] = matrix[i][reversIdx - i];
            idxArr++;
        }
        return arr;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
