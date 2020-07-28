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
        int[] counterDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix.length; columnIndex++) {
                if (minValue > matrix[rowIndex][columnIndex]) {
                    minValue = matrix[rowIndex][columnIndex];
                }
            }
        }
        return minValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix.length; columnIndex++) {
                if (maxValue < matrix[rowIndex][columnIndex]) {
                    maxValue = matrix[rowIndex][columnIndex];
                }
            }
        }
        return maxValue;
    }
}
