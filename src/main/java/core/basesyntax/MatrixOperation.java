package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці, максимального та
 * мінімального елементів.
 */
public class MatrixOperation {

    /**
     * Returns main diagonal of matrix.
     *
     * @return main diagonal of matrix
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    /**
     * Returns min value of matrix.
     *
     * @return min value of matrix, or 0 if matrix empty
     */
    public int getMin(int[][] matrix) {
        int min;
        if (matrix != null) {
            min = matrix[0][0];
        } else {
            return 0;
        }
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }

    /**
     * Returns max value of matrix.
     *
     * @return max value of matrix or 0, if matrix empty
     */
    public int getMax(int[][] matrix) {
        int max;
        if (matrix != null) {
            max = matrix[0][0];
        } else {
            return 0;
        }
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }
}
