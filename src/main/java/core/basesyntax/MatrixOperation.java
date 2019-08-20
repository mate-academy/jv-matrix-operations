package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    /**
     * Returns an array of elements of the main diagonal of the matrix.
     *
     * @param matrix double array that is a representation of a matrix
     * @return array of elements of the main diagonal of the matrix
     */
    public int[] getDiagonal(int[][] matrix) {
        int diagonalCapacity = Math.min(matrix.length, matrix[0].length);
        int[] diogonal = new int[diagonalCapacity];
        for (int i = 0; i < diagonalCapacity; i++) {
            diogonal[i] = matrix[i][i];
        }
        return diogonal;
    }

    /**
     * Returns min element of the matrix.
     *
     * @param matrix double array that is a representation of a matrix
     * @return min element of the matrix
     */
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

    /**
     * Returns max element of the matrix.
     *
     * @param matrix double array that is a representation of a matrix
     * @return max element of the matrix
     */
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
