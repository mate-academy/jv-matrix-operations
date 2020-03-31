package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] principalDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            principalDiagonal[i] = (matrix[i][i]);
        }
        return principalDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int len = matrix.length - 1, i = len; i >= 0; i--) {
            counterDiagonal[len - i] = matrix[len - i][i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                min = matrix[row][col] < min ? matrix[row][col] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                max = matrix[row][column] > max ? matrix[row][column] : max;
            }
        }
        return max;
    }
}
