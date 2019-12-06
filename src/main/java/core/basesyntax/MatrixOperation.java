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

        int[] secondaryDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiag[i] = matrix[i][matrix.length - 1 - i];
        }
        return secondaryDiag;
    }

    public int getMin(int[][] matrix) {

        int minimalValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    minimalValue = matrix[0][0];
                }
                if (minimalValue > matrix[i][j]) {
                    minimalValue = matrix[i][j];
                }
            }
        }
        return minimalValue;
    }

    public int getMax(int[][] matrix) {

        int maximalValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    maximalValue = matrix[0][0];
                }
                if (maximalValue < matrix[i][j]) {
                    maximalValue = matrix[i][j];
                }
            }
        }
        return maximalValue;
    }
}
