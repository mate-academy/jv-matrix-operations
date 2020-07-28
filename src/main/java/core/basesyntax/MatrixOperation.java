package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    result[i] = matrix[i][j];
                }
            }
        }
        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        if (matrix.length == 1) {
            return new int[]{matrix[0][0]};
        }

        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][matrix.length - 1 - i];
        }
        return result;
    }

    public int getMin(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < result) {
                    result = matrix[i][j];
                }
            }
        }
        return result;
    }

    public int getMax(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > result) {
                    result = matrix[i][j];
                }
            }
        }
        return result;
    }
}
