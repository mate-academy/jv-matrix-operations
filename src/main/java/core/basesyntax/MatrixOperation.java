package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    /**
     * Метод повертає головну діагональ матриці.
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    /**
     * Метод повертає найменший елемент матриці.
     */
    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] < min) {
                    min = matrix[i][ii];
                }
            }
        }
        return min;
    }

    /**
     * Метод повертає найбільший елемент матриці.
     */
    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] > max) {
                    max = matrix[i][ii];
                }
            }
        }
        return max;
    }
}
