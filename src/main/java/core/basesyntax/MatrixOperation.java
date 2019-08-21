package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            ;
            for (int k = 0; k < matrix[0].length; k++) {
                if (j == k) {
                    array[j] = matrix[j][k];
                }
            }
        }
        return array;
    }


    public int getMin(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            maxValue = matrix[i][0];
            for (int j = 0; j < matrix[0].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}
