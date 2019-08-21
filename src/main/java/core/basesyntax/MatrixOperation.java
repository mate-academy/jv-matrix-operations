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
        int minElement = matrix[0][0];

        for (int[] i : matrix) {
            for (int j : i) {
                if (j < minElement) {
                    minElement = j;
                }
            }
        }
        return minElement;
    }

    public int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];

        for (int[] i : matrix) {
            for (int j : i) {
                if (j > maxElement) {
                    maxElement = j;
                }
            }
        }
        return maxElement;
    }
}
