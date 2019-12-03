package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i <= matrix.length - 1; i++) {
            mainDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return mainDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minimum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                minimum = matrix[i][j] < minimum ? matrix[i][j] : minimum;
            }
        }
        return minimum;
    }

    public int getMax(int[][] matrix) {
        int maximum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                maximum = matrix[i][j] > maximum ? matrix[i][j] : maximum;
            }
        }
        return maximum;
    }
}
