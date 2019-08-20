package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonl = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mainDiagonl[i] = matrix[i][j];
                }
            }
        }

        return mainDiagonl;
    }

    public int getMin(int[][] matrix) {
        int tempMin = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < tempMin) {
                    tempMin = matrix[i][j];
                }
            }
        }

        return tempMin;
    }

    public int getMax(int[][] matrix) {
        int tempMax = -5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > tempMax) {
                    tempMax = matrix[i][j];
                }
            }
        }

        return tempMax;
    }
}
