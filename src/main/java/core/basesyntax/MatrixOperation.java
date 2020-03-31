package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int diagonalLength = matrix.length;
        int[] diagonal = new int[diagonalLength];
        for (int i = 0; i < diagonalLength; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int diagonalLength = matrix.length;
        int[] counterDiagonal = new int[diagonalLength];
        for (int i = 0, j = diagonalLength - 1; i < diagonalLength; i++, j--) {
            counterDiagonal[i] = matrix[i][j];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int matrixShape = matrix.length;
        int matrixSize = matrix.length * matrix.length;
        int min = matrix[0][0];

        for (int i = 1; i < matrixSize; i++) {
            if (matrix[i / matrixShape][i % matrixShape] < min) {
                min = matrix[i / matrixShape][i % matrixShape];
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int matrixShape = matrix.length;
        int matrixSize = matrix.length * matrix.length;
        int max = matrix[0][0];

        for (int i = 1; i < matrixSize; i++) {
            if (matrix[i / matrixShape][i % matrixShape] > max) {
                max = matrix[i / matrixShape][i % matrixShape];
            }
        }
        return max;
    }
}
