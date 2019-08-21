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
        int[] oneDMatrix = new int[matrix[0].length * matrix.length];
        int t = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                oneDMatrix[t] = j;
                t++;
            }
        }
        int min = oneDMatrix[0];
        for (int i : oneDMatrix) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    protected int getMax(int[][] matrix) {
        int[] oneDMatrix = new int[matrix[0].length * matrix.length];
        int t = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                oneDMatrix[t] = j;
                t++;
            }
        }
        int max = oneDMatrix[0];
        for (int i : oneDMatrix) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
