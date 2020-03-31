package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] ans = new int[matrix.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = matrix[i][i];
        }
        return ans;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] ans = new int[matrix.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = matrix[i][ans.length - 1 - i];
        }
        return ans;
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
