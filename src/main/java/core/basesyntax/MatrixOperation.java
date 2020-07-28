package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] headDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            headDiagonal[i] = matrix[i][i];
        }
        return headDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] sideDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sideDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return sideDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
