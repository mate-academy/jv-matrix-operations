package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {

        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }

        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {

        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int height = matrix.length - i - 1;
            diagonal[i] = matrix[i][height];
        }

        return diagonal;
    }

    public int getMin(int[][] matrix) {

        int min = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                min = arr[i] < min ? arr[i] : min;
            }
        }

        return min;
    }

    public int getMax(int[][] matrix) {

        int max = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                max = arr[i] > max ? arr[i] : max;
            }
        }

        return max;
    }
}
