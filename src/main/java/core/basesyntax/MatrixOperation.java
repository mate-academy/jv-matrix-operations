package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці, максимального та
 * мінімального елементів.
 */
public class MatrixOperation {

    /**
     * Method return main diagonal of matrix.
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
     * Method return min value of matrix.
     * @return min value of matrix.
     */
    public int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
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
     * Method return max value of matrix.
     * @return max value of matrix.
     */
    public int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
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
