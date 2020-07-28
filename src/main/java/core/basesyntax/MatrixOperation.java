package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < mainDiagonal.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] sideDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sideDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return sideDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minValue = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (minValue > ints[j]) {
                    minValue = ints[j];
                }
            }
        }
        return minValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (maxValue < ints[j]) {
                    maxValue = ints[j];
                }
            }
        }
        return maxValue;
    }
}
