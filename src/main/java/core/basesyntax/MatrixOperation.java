package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
 public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] getDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            getDiagonal[i] = matrix[i][i];
        }
        return getDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                min = (min > matrix[i][j]) ? matrix[i][j] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int a = 0; a < matrix.length; a++) {
            for (int j = 0; j < matrix.length; j++) {
                max = (max < matrix[a][j]) ? matrix[a][j] : max;
            }
        }
        return max;
    }
 }