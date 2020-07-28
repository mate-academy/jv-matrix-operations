package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int first = 0, second = 0; first < matrix.length; first++, second++) {
            result[first] = matrix[first][second];
        }

        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int first = 0, second = matrix.length - 1; first < matrix.length; first++, second--) {
            result[first] = matrix[first][second];
        }

        return result;
    }

    public int getMin(int[][] matrix) {
        int minElement = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }

        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        return maxElement;
    }
}
