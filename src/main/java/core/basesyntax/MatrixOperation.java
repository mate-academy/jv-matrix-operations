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
        int min = matrix[0][0];

        for (int[] integers : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (integers[j] < min) {
                    min = integers[j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] integers : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (integers[j] > max) {
                    max = integers[j];
                }
            }
        }
        return max;
    }
}
