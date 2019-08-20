package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    /**
     * This function returns
     * diagonal of square matrix.
     */
    public int[] getDiagonal(int[][] matrix) {
        int resLength = matrix.length;
        int[] result = new int[resLength];
        for (int i = 0; i < resLength; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    /**
     * This function returns
     * minimal element of matrix.
     */
    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] arr : matrix) {
            for (int num : arr) {
                min = Math.min(min, num);
            }
        }
        return min;
    }

    /**
     * This function returns
     * maximal element of matrix.
     */
    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] arr : matrix) {
            for (int num : arr) {
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
