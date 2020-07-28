package core.basesyntax;

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] response = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            response[i] = matrix[i][i];
        }
        return response;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] response = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            response[i] = matrix[i][matrix[i].length - i - 1];
        }
        return response;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] mass : matrix) {
            for (int value : mass) {
                if (min > value) {
                    min = value;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] mass : matrix) {
            for (int value : mass) {
                if (max < value) {
                    max = value;
                }
            }
        }
        return max;
    }
}
