package core.basesyntax;

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        /*for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (i + j == matrix[0].length - 1) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }*/
        for (int i = 0; i < matrix[0].length; i++) {
            diagonal[i] = matrix[i][matrix[0].length - 1 - i];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
