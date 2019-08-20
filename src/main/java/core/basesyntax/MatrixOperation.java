package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    /**
     * Returns diagonal.
     *
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0;i < matrix.length;i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    /**
     * Returns the smaller number of values {@code int} in matrix.
     *
     */
    public int getMin(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = Integer.min(matrix[i][j], result);
            }
        }
        return result;
    }

    /**
     * Returns the greatest number of values {@code int} in matrix.
     *
     */
    public int getMax(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = Integer.max(matrix[i][j], result);
            }
        }
        return result;
    }
}
