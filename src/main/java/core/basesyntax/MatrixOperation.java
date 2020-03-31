package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int j = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][j];
            j--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                minElement = matrix[i][j] < minElement ? matrix[i][j] : minElement;
            }
        }
        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElem = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                maxElem = matrix[i][j] > maxElem ? matrix[i][j] : maxElem;
            }
        }
        return maxElem;
    }
}
