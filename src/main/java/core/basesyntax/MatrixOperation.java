package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int [] counterDiagonal = new int[matrix[0].length];
        int counter = matrix[0].length - 1;
        for (int i = 0; i < matrix[0].length; i++) {
            counterDiagonal[i] = matrix[i][counter];
            counter--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = 0;
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = 0;
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
