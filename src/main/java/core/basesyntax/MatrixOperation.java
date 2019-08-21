package core.basesyntax;

public class MatrixOperation {

    protected int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    protected int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    min = matrix[i][j + 1];
                }
            }
        }
        return min;
    }

    protected int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    max = matrix[i][j + 1];
                }
            }
        }
        return max;
    }
}
