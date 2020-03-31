package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int s = matrix.length;
        int[] diagonal = new int[s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int s = matrix.length;
        int[] counterDiagonal = new int[s];
        for (int i = 0; i < s; i++) {
            counterDiagonal[i] = matrix[i][s - 1 - i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int s = matrix.length;
        int min = matrix[0][0];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int s = matrix.length;
        int max = matrix[0][0];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
