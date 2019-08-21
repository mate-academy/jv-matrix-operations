package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonl = new int[matrix.length];
        for (int i = 0; i < matrix.length && matrix[i].length > i; i++) {
            mainDiagonl[i] = matrix[i][i];
        }
        return mainDiagonl;
    }

    public int getMin(int[][] matrix) {
        int tempMin = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < tempMin) {
                    tempMin = matrix[i][j];
                }
            }
        }
        return tempMin;
    }

    public int getMax(int[][] matrix) {
        int tempMax = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > tempMax) {
                    tempMax = matrix[i][j];
                }
            }
        }
        return tempMax;
    }
}
