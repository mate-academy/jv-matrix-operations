package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int[] returnArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            returnArray[i] = matrix[i][i];
        }
        return returnArray;
    }

    protected int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                min = min > matrix[i][j] ? matrix[i][j] : min;
            }
        }
        return min;
    }

    protected int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max = max < matrix[i][j] ? matrix[i][j] : max;
            }
        }
        return max;
    }
}
