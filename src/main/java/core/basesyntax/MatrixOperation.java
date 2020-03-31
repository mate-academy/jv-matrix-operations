package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int i = 0; i < counterDiagonal.length; i++) {
            counterDiagonal[i] = matrix[i][counterDiagonal.length - 1 - i];
        }
        return counterDiagonal;
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
