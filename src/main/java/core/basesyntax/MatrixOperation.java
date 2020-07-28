package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] getDiagonal = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            getDiagonal[i] = matrix[i][i];
        }
        return getDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int j = matrix.length - 1;
        int [] getCounterDiagonal = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            getCounterDiagonal[i] = matrix[i][j];
            j--;
        }
        return getCounterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int getMin = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix [i].length; j++) {
                if (getMin > matrix[i][j]) {
                    getMin = matrix[i][j];
                }
            }
        }
        return getMin;
    }

    public int getMax(int[][] matrix) {
        int getMax = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix [i].length; j++) {
                if (getMax < matrix[i][j]) {
                    getMax = matrix[i][j];
                }
            }
        }
        return getMax;
    }
}
