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
        int column = matrix.length - 1;
        for (int raw = 0; raw < matrix.length; raw++) {
            counterDiagonal[raw] = matrix[raw][column--];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] raw : matrix) {
            for (int element : raw) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] raw : matrix) {
            for (int element : raw) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
