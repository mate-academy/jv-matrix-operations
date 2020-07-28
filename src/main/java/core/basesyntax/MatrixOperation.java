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

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] < minElement) {
                    minElement = matrix[row][column];
                }
            }
        }

        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] > maxElement) {
                    maxElement = matrix[row][column];
                }
            }
        }

        return maxElement;
    }
}
