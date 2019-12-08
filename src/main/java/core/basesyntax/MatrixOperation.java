package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {

        int[] myArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            myArr[i] = matrix[i][i];
        }
        return myArr;
    }

    public int[] getCounterDiagonal(int[][] matrix) {

        int[] myArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            myArr[i] = matrix[i][matrix.length - i - 1];
        }
        return myArr;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
