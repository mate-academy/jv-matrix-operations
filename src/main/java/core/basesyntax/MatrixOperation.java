package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] resultArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            resultArray[i] = matrix[i][i];
        }
        return resultArray;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] resultArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            resultArray[i] = matrix[i][matrix.length - i - 1];
        }
        return resultArray;
    }

    public int getMin(int[][] matrix) {
        int result = matrix[0][0];
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
        int result = matrix[0][0];
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
