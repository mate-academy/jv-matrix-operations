package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        int counter1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][counter1];
            counter1++;
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int counter2 = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            counterDiagonal[i] = matrix[i][counter2];
            counter2++;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
