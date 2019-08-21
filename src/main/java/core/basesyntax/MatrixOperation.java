package core.basesyntax;
/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] vector : matrix) {
            for (int element : vector) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] vector : matrix) {
            for (int element : vector) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
