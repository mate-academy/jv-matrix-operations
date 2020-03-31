package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
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

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int j = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][j];
            j--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int[] min = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sortMatrix(matrix[i]);
            min[i] = matrix[i][0];
        }
        sortMatrix(min);
        return min[0];
    }

    public int getMax(int[][] matrix) {
        int[] max = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sortMatrix(matrix[i]);
            max[i] = matrix[i][matrix.length - 1];
        }
        sortMatrix(max);
        return max[max.length - 1];
    }

    public int[] sortMatrix(int[] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i] > matrix[i + 1]) {
                temp = matrix[i + 1];
                matrix[i + 1] = matrix[i];
                matrix[i] = temp;
            }
        }
        return matrix;
    }
}
