package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix[0].length];
        for (int i = 0, j = matrix[0].length; i < counterDiagonal.length; i++, j--) {
            counterDiagonal[i] = matrix[i][j - 1];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = min > matrix[i][j]
                        ? matrix[i][j] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = max < matrix[i][j]
                        ? matrix[i][j] : max;
            }
        }
        return max;
    }
}
