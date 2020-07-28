package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int indexOfMatrix = 0; indexOfMatrix < matrix.length; indexOfMatrix++) {
            mainDiagonal[indexOfMatrix] = matrix[indexOfMatrix][indexOfMatrix];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int indexOfMatrix = 0; indexOfMatrix < matrix.length; indexOfMatrix++) {
            counterDiagonal[indexOfMatrix] =
                    matrix[indexOfMatrix][matrix.length - indexOfMatrix - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minValue = Integer.MAX_VALUE;
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
        int maxValue = Integer.MIN_VALUE;
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
