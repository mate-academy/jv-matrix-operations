package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = matrix.length - 1;i >= 0;i--) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int n = matrix[i][j];
                if (n < min) {
                    min = n;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int n = matrix[i][j];
                if (n > max) {
                    max = n;
                }
            }
        }
        //new Arrays.stream(matrix).ge/
        return max;
    }
}
