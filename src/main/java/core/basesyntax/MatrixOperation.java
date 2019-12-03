package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int i;
        int j;
        int k = 0;
        int [] diagonal = new int [matrix.length];
        if (matrix.length != 1) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[0].length; j++) {
                    if (i == j) {
                        diagonal[k] = matrix[i][j];
                        k++;
                    }
                }
            }
        } else {
            diagonal = matrix[0];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int i;
        int j;
        int k = 0;
        int [] diagonal = new int [matrix.length];
        if (matrix.length != 1) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[0].length; j++) {
                    if (i + j == matrix.length - 1) {
                        diagonal[k] = matrix[i][j];
                        k++;
                    }
                }
            }
        } else {
            diagonal = matrix[0];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int i;
        int j;
        int min = matrix[0][0];
        if (matrix.length != 1) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int i;
        int j;
        int max = matrix[0][0];
        if (matrix.length != 1) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        return max;
    }
}
