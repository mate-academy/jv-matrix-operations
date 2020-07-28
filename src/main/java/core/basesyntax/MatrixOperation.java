package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int length = 0;
        int[] diagonal = new int[matrix.length];

        while (length < matrix.length) {
            diagonal[length] = matrix[length][length];
            length++;
        }

        return matrix == null ? null : diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int height = matrix.length - 1;
        int length = 0;
        int[] diagonal = new int[matrix.length];

        while (length < matrix.length && height >= 0) {
            diagonal[length] = matrix[length][height];
            length++;
            height--;
        }

        return matrix == null ? null : diagonal;
    }

    public int getMin(int[][] matrix) {

        int min = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                min = Math.min(arr[i], min);
            }
        }

        return matrix == null ? 0 : min;
    }

    public int getMax(int[][] matrix) {

        int max = matrix[0][0];
        for (int[] arr : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(arr[i], max);
            }
        }

        return matrix == null ? 0 : max;
    }
}
