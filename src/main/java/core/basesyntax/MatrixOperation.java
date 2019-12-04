package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = (matrix[i][i]);
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int tmp = 0;
        int[] diagonal = new int[matrix.length];
        for (int i = matrix.length - 1; i > -1; i--) {
            tmp = (matrix.length - 1) - i;
            diagonal[tmp] = (matrix[tmp][i]);
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                min = matrix[i][j] < min ? matrix[i][j] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max = matrix[i][j] > max ? matrix[i][j] : max;
            }
        }
        return max;
    }
}
