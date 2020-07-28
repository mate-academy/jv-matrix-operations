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
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minValue = Integer.MAX_VALUE;
        for (int[] matrixRow : matrix) {
            for (int matrixElement : matrixRow) {
                if (matrixElement < minValue) {
                    minValue = matrixElement;
                }
            }
        }
        return minValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] matrixRow : matrix) {
            for (int matrixElement : matrixRow) {
                if (matrixElement > maxValue) {
                    maxValue = matrixElement;
                }
            }
        }
        return maxValue;
    }
}
