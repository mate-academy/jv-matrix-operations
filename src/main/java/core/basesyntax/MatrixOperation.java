package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0;i < matrix.length;i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0;i < matrix.length;i++) {
            result[i] = matrix[i][matrix.length - 1 - i];
        }

        return result;
    }

    public int getMin(int[][] matrix) {
        int matrixMin = Integer.MAX_VALUE;
        for (int[] massive : matrix) {
            for (int number : massive) {
                if (number < matrixMin) {
                    matrixMin = number;
                }
            }
        }
        return matrixMin;
    }

    public int getMax(int[][] matrix) {
        int matrixMax = Integer.MIN_VALUE;
        for (int[] massive : matrix) {
            for (int number : massive) {
                if (number > matrixMax) {
                    matrixMax = number;
                }
            }
        }
        return matrixMax;
    }
}
