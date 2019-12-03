package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int arrayLength = matrix.length - 1;
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i <= arrayLength; i++) {
            mainDiagonal[i] = matrix[i][arrayLength - i];
        }
        return mainDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                minimum = matrix[i][j] < minimum ? matrix[i][j] : minimum;
            }
        }
        return minimum;
    }

    public int getMax(int[][] matrix) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                maximum = matrix[i][j] > maximum ? matrix[i][j] : maximum;
            }
        }
        return maximum;
    }
}
