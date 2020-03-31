package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diadonall = new int[matrix.length];
        for (int i = 0; i < diadonall.length; i++) {
            diadonall[i] = matrix[i][i];
        }
        return diadonall;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] sideDiadonal = new int[matrix.length];
        for (int i = 0; i < sideDiadonal.length; i++) {
            sideDiadonal[i] = matrix[i][sideDiadonal.length - 1 - i];
        }
        return sideDiadonal;
    }

    public int getMin(int[][] matrix) {
        int minn = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minn > matrix[i][j]) {
                    minn = matrix[i][j];
                }
            }
        }
        return minn;
    }

    public int getMax(int[][] matrix) {
        int maxx = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxx < matrix[i][j]) {
                    maxx = matrix[i][j];
                }
            }
        }
        return maxx;
    }
}
