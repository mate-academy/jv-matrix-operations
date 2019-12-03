package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mdiag = new int[matrix.length];
        for (int i = 0; i < mdiag.length; i++) {
            mdiag[i] = matrix[i][i];
        }
        return mdiag;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] cdiag = new int[matrix.length];
        for (int i = 0; i < cdiag.length; i++) {
            cdiag[i] = matrix[i][cdiag.length - i - 1];
        }
        return cdiag;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = min > matrix[i][j] ? matrix[i][j] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = max < matrix[i][j] ? matrix[i][j] : max;
            }
        }
        return max;
    }
}
