package core.basesyntax;
/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            res[i] = matrix[i][i];
        }
        return res;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] slice : matrix) {
            for (int element : slice) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] slice : matrix) {
            for (int element : slice) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
