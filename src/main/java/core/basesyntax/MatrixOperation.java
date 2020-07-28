package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        if (matrix.length == 1) {
            return matrix[0];
        }
        int[] resultArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            resultArray[i] = matrix[i][i];
        }
        return resultArray;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        if (matrix.length == 1) {
            return matrix[0];
        }
        int[] resultArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            resultArray[i] = matrix[i][matrix.length - i - 1];
        }
        return resultArray;
    }

    public int getMin(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int[] arrayLine : matrix) {
            for (int arrayColumn : arrayLine) {
                if (arrayColumn < result) {
                    result = arrayColumn;
                }
            }
        }
        return result;
    }

    public int getMax(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        for (int[] arrayLine : matrix) {
            for (int arrayColumn : arrayLine) {
                if (arrayColumn > result) {
                    result = arrayColumn;
                }
            }
        }
        return result;
    }
}
