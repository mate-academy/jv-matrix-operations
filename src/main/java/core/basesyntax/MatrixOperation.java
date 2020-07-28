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
        int[] cdiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            cdiagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return cdiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] line:matrix) {
            for (int el :line) {
                if (el < min) {
                    min = el;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] line:matrix) {
            for (int el :line) {
                if (el > max) {
                    max = el;
                }
            }
        }
        return max;
    }
}
