package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int size = matrix[0].length > matrix.length ? matrix.length : matrix[0].length;
        int[] retArray = new int[size];
        for (int i = 0; i < size; i++) {
            retArray[i] = matrix[i][i];
        }
        return retArray;
    }

    protected int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                min = min > matrix[i][j] ? matrix[i][j] : min;
            }
        }
        return min;
    }

    protected int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = max < matrix[i][j] ? matrix[i][j] : max;
            }
        }
        return max;
    }
}

