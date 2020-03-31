package core.basesyntax;

public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int [] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    result[i] = matrix[i][j];
                }
            }
        }
        return result;
    }

    public int [] getCounterDiagonal(int[][] matrix) {
        int [] result = new int [matrix.length];
        int num = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            result [i] = matrix [i] [num];
            num--;
        }
        return result;
    }

    public int getMin(int [][] matrix) {
        int pivot = matrix [0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix [i].length; j++) {
                if (matrix [i][j] < pivot) {
                    pivot = matrix [i][j];
                }
            }
        }
        return pivot;
    }

    public int getMax(int[][] matrix) {
        int pivot = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix [i].length; j++) {
                if (matrix [i][j] > pivot) {
                    pivot = matrix [i] [j];
                }
            }
        }
        return pivot;
    }
}
