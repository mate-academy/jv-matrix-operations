package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] matrixDiagonal = new int [matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            matrixDiagonal[i] = matrix[i][i];
        }
        return matrixDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int [matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix[i].length - i - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] rowMatrix:matrix) {
            for (int i = 0; i < rowMatrix.length; i++) {
                if (min > rowMatrix[i]) {
                    min = rowMatrix[i];
                }
            }
        }

        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] rowMatrix:matrix) {
            for (int i = 0; i < rowMatrix.length; i++) {
                if (max < rowMatrix[i]) {
                    max = rowMatrix[i];
                }
            }
        }

        return max;
    }
}
