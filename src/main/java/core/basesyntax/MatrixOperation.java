package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int y = 0; y < matrix.length; y++) {
            counterDiagonal[y] = matrix[y][matrix.length - 1 - y];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] ints : matrix) {
            for (int x = 0; x < matrix.length; x++) {
                if (min > ints[x]) {
                    min = ints[x];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int x = 0; x < matrix.length; x++) {
                if (max < ints[x]) {
                    max = ints[x];
                }
            }
        }
        return max;
    }
}
