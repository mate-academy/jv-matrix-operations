package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result;
        if (row < col) {
            result = new int[row];
        } else {
            result = new int[col];
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    result[i] = matrix[i][j];
                }
            }
        }
        return result;
    }

    protected int getMin(int[][] matrix) {
        int minimum = Integer.MAX_VALUE;
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                if (number < minimum) {
                    minimum = number;
                }
            }
        }
        return minimum;
    }

    protected int getMax(int[][] matrix) {
        int maximum = Integer.MIN_VALUE;
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                if (number > maximum) {
                    maximum = number;
                }
            }
        }
        return maximum;
    }
}
