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
        int[] counterDiagonal = new int[matrix.length];
        int index2 = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][index2];
            index2--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int column : row) {
                if (column < min) {
                    min = column;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int column : row) {
                if (column > max) {
                    max = column;
                }
            }
        }
        return max;
    }
}
