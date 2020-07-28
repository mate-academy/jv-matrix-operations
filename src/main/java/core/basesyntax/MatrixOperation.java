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
        int[] secondaryDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return secondaryDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int cell : row) {
                min = (cell < min) ? min = cell : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int cell : row) {
                max = (cell > max) ? cell : max;
            }
        }
        return max;
    }
}
