package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int matrixLength = matrix.length;
        int[] diagonal = new int[matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int matrixLength = matrix.length;
        int[] counterDiagonal = new int[matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            counterDiagonal[i] = matrix[i][matrixLength - i - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int i : row) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int i : row) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
