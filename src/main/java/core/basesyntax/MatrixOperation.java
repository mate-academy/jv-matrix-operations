package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {

        int[] mainDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiag[i] = matrix[i][j];
                }
            }
        }
        return mainDiag;
    }

    public int[] getCounterDiagonal(int[][] matrix) {

        int[] secDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            secDiag[i] = matrix[i][matrix.length - 1 - i];
        }
        return secDiag;
    }

    public int getMin(int[][] matrix) {

        int minVal = 2147483647;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minVal > matrix[i][j]) {
                    minVal = matrix[i][j];
                }
            }
        }
        return minVal;
    }

    public int getMax(int[][] matrix) {

        int maxVal = -2147483648;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxVal < matrix[i][j]) {
                    maxVal = matrix[i][j];
                }
            }
        }
        return maxVal;
    }
}
