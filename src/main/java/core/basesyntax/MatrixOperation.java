package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int l = matrix[0].length;
        int[] result = new int[l];
        for (int i = 0; i < l; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int l = matrix[0].length;
        int[] result = new int[l];
        for (int i = 0; i < l; i++) {
            result[i] = matrix[i][l - 1 - i];
        }
        return result;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        int l = matrix[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        int l = matrix[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
